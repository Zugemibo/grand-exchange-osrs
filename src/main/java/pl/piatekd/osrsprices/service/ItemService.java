package pl.piatekd.osrsprices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.repository.ItemRepository;

public interface ItemService {
	

	public Item findByName(String name);

	public List<Item> findAll();

	public int findByIdName(String itemName);

}
