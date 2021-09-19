package pl.piatekd.osrsprices.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.model.ItemVolume;
import pl.piatekd.osrsprices.service.ItemService;
import pl.piatekd.osrsprices.service.ItemVolumeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ResourceManager {

    private static final String BASE_URL = "https://prices.runescape.wiki/api/v1/osrs/";

    private static final String FILE_NAME = "data.json";

    private static final String NEWLINE = System.getProperty("line.separator");

    private final RestTemplate template;

    private final ItemService itemService;

    private final ItemVolumeService itemVolumeService;

    public ResourceManager(ItemService itemService, RestTemplate template, ItemVolumeService itemVolumeService) {
        this.itemService = itemService;
        this.template = template;
        this.itemVolumeService = itemVolumeService;
    }

    public void getLatestDataPrices() {
        String response = template.getForObject(BASE_URL + "latest", String.class);
        saveLatestPrices(response);
    }

    public void getLatestDataVolumes() {
        String response = template.getForObject(BASE_URL + "volumes", String.class);
        saveLatestVolumes(response);
    }


    private void saveLatestPrices(String response) {
        final ObjectMapper objectMapper = new ObjectMapper();

        try {
            Map<String, Object> itemsInMap = objectMapper.readValue(response, Map.class);


            Map<String, Object> itemMap = (Map<String, Object>) itemsInMap.get("data");

            List<Item> itemList = new ArrayList<>();

            for (Map.Entry<String, Object> entry : itemMap.entrySet()) {
                Map<String, Integer> itemValues = (Map<String, Integer>) entry.getValue();

                Long itemId = Long.valueOf(entry.getKey());
                Integer highPrice = itemValues.get("high");
                Integer highPriceTime = itemValues.get("highTime");
                Integer lowPrice = itemValues.get("low");
                Integer lowPriceTime = itemValues.get("lowTime");

                System.out.println(itemId + ", " + highPrice + ", " + highPriceTime + ", " + lowPrice + ", " + lowPriceTime);

                Item item = new Item(itemId, highPrice, highPriceTime, lowPrice, lowPriceTime);

                itemList.add(item);
            }
            itemService.saveAll(itemList);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }

    private void saveLatestVolumes(String response) {
        final ObjectMapper objectMapper = new ObjectMapper();

        try {
            Map<String, Object> itemsInMap = objectMapper.readValue(response, Map.class);


            Integer timestamp = (Integer) itemsInMap.get("timestamp");

            Map<String, Long> itemMap = (Map<String, Long>) itemsInMap.get("data");

            List<ItemVolume> itemVolumeList = new ArrayList<>();

            for (Map.Entry entry : itemMap.entrySet()) {
                Long itemId = Long.valueOf(entry.getKey().toString());
                Long itemVolumeValue = Long.valueOf(entry.getValue().toString());

                ItemVolume itemvolume = new ItemVolume(itemId, timestamp, itemVolumeValue);
                itemVolumeList.add(itemvolume);
            }
            itemVolumeService.saveAll(itemVolumeList);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }


}
