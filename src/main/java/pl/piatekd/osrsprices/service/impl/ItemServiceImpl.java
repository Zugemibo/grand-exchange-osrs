package pl.piatekd.osrsprices.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.piatekd.osrsprices.dto.ItemDTO;
import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.repository.ItemRepository;
import pl.piatekd.osrsprices.repository.ItemRepositoryImpl;
import pl.piatekd.osrsprices.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemRepositoryImpl itemRepositoryImpl;

    public ItemServiceImpl(ItemRepository itemRepository, ItemRepositoryImpl itemRepositoryImpl) {
        this.itemRepository = itemRepository;
        this.itemRepositoryImpl = itemRepositoryImpl;
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }


    @Override
    public void saveAll(List<Item> itemList) {
        itemRepository.saveAll(itemList);
    }

    @Override
    public Item findItemById(Long itemId) {
        return itemRepository.findItemById(itemId);
    }

    @Override
    public List<Long> getAllIds() {
        return itemRepository.getAllIds();
    }

    @Override
    public List<ItemDTO> getItemByName(String itemName) {

        return itemRepositoryImpl.getItemsByName(itemName);
    }

    @Override
    public List<ItemDTO> getItemsWithLargestMargin(boolean nonMemberItemsOnly, boolean isPercentMargin) {
        if (isPercentMargin) {
            return itemRepositoryImpl.getItemsWithLargestPercentageMargin(nonMemberItemsOnly);
        } else {
            return itemRepositoryImpl.getItemsWithLargestMargin(nonMemberItemsOnly);
        }
    }

    @Override
    public List<ItemDTO> getBestHighAlchItems() {
        return itemRepositoryImpl.getBestHighAlchItems();
    }

    @Override
    public List<ItemDTO> getHighVolumeItems() {
        return itemRepositoryImpl.getHighVolumeItems();
    }

    @Override
    public List<ItemDTO> getSuggestedItems(boolean includeMemberItems) {
        return itemRepositoryImpl.getSuggestedItems(includeMemberItems);
    }

}
