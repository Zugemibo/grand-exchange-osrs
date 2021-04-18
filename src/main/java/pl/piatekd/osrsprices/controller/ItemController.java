package pl.piatekd.osrsprices.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.repository.ItemRepository;
import pl.piatekd.osrsprices.service.ItemService;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {
	
	private static final String BASE_URL = "https://prices.runescape.wiki/api/v1/osrs/";
	
	private final ItemService itemService;
	
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@GetMapping("/{itemId}")
	public String fetchItemById(@PathVariable String itemId) {
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("User-Agent", "Educational purposes");
		ResponseEntity<String> response
		  = restTemplate.exchange(BASE_URL+ "latest?id=" + itemId,HttpMethod.GET, new HttpEntity<String>(headers), String.class);
		
		return response.getBody();
	}
	
	@GetMapping("/getItemByName/{name}")
	public Item getByName(@PathVariable String name) {
		return itemService.findByName(name);
		
	}
}
