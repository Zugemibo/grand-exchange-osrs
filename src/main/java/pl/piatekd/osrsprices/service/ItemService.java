package pl.piatekd.osrsprices.service;

import pl.piatekd.osrsprices.dto.ItemDTO;
import pl.piatekd.osrsprices.model.Item;

import java.math.BigDecimal;
import java.util.List;

public interface ItemService {

	List<Item> findAll();

    void saveAll(List<Item> itemList);

	Item findItemById(Long itemId);

	List<Long> getAllIds();

	List<ItemDTO> getItemByName(String itemName);

	ItemDTO getSingleItemByName(String itemName);

    List<ItemDTO> getItemsWithLargestMargin();

	List<ItemDTO> getItemsWithLargestPercentageMargin();

	List<ItemDTO> getBestHighAlchItems();

    List<ItemDTO> getHighVolumeItems();
}
