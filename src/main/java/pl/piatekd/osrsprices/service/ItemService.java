package pl.piatekd.osrsprices.service;

import org.springframework.stereotype.Service;

import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.repository.ItemRepository;

@Service
public class ItemService {
	
	private final ItemRepository itemRepository;
	
	
	public ItemService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}


	public Item findByName(String name) {
		return itemRepository.findItemByItemName(name);
	}

}
