package pl.piatekd.osrsprices.service;

import pl.piatekd.osrsprices.dto.ItemDTO;
import pl.piatekd.osrsprices.model.Item;

import java.util.List;

public interface ItemService {

	List<Item> findAll();

    void saveAll(List<Item> itemList);

	Item findItemById(Long itemId);

	List<Long> getAllIds();

	List<ItemDTO> getItemByName(String itemName);

    List<ItemDTO> getItemsWithLargestMargin(boolean includeMemberItems);

	List<ItemDTO> getItemsWithLargestPercentageMargin(boolean includeMemberItems);

	List<ItemDTO> getBestHighAlchItems();

    List<ItemDTO> getHighVolumeItems();

	List<ItemDTO> getSuggestedItems(boolean includeMemberItems);
}
