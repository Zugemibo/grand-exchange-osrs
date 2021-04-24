package pl.piatekd.osrsprices.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import pl.piatekd.osrsprices.exception.ItemNotFoundException;
import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.service.ItemService;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

	private static final String BASE_URL = "https://prices.runescape.wiki/api/v1/osrs/";

	private final ItemService itemService;

	private final RestTemplate template;

	public ItemController(ItemService itemService, RestTemplate template) {
		this.itemService = itemService;
		this.template = template;
	}

	@GetMapping("/getById/{itemId}")
	public String fetchItemById(@PathVariable String itemId) {
		try {
			String response = template.getForObject(BASE_URL + "latest?id=" + itemId, String.class);
			return response;
		} catch (RuntimeException e) {
			throw new ItemNotFoundException();
		}

	}

	@GetMapping("/getByName/{itemName}")
	public String fetchItemByName(@PathVariable String itemName) throws ItemNotFoundException {
		
		try {
		int itemId = itemService.findByIdName(itemName);
		String response = template.getForObject(BASE_URL + "latest?id=" + itemId, String.class);
		return response;
		}
		catch(RuntimeException e) {
			throw new ItemNotFoundException();
		}

	}

	@GetMapping("/getItemByName/{name}")
	public Item getByName(@PathVariable String name) {
		try {
		return itemService.findByName(name);
		}
		catch(RuntimeException e) {
			throw new ItemNotFoundException();
		}

	}

	@GetMapping("/getAll")
	public List<Item> getAll() {
		try {
		return itemService.findAll();
		}
		catch(RuntimeException e) {
			throw new ItemNotFoundException();
		}

	}
}
