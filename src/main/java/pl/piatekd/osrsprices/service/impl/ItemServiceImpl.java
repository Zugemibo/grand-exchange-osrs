package pl.piatekd.osrsprices.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.repository.ItemRepository;
import pl.piatekd.osrsprices.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	private final ItemRepository itemRepository;
	
	public ItemServiceImpl(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public Item findByName(String name) {
		return itemRepository.findItemByName(name);
	}

	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

	@Override
	public int findByIdName(String itemName) {
		return itemRepository.findIdByName(itemName);
	}

}
