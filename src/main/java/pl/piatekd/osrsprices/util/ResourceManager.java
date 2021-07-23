package pl.piatekd.osrsprices.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.service.ItemService;

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

	public ResourceManager(ItemService itemService, RestTemplate template) {
		this.itemService = itemService;
		this.template = template;
	}

	public void getDataFromApi(){
		String response = template.getForObject(BASE_URL + "latest", String.class);
		System.out.println(response.substring(0,100));
		saveDataInDatabase(response);
	}


	private void saveDataInDatabase(String response){
		System.out.println(response.substring(0,100));
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

}
