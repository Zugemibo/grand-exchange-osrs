package pl.piatekd.osrsprices.controller;

import org.springframework.web.bind.annotation.*;
import pl.piatekd.osrsprices.model.Item;
import pl.piatekd.osrsprices.service.ItemService;
import pl.piatekd.osrsprices.util.ResourceManager;

@RestController
@RequestMapping("/v1/api/items")
@CrossOrigin(origins = "http://localhost:4200")
public class ResourceController {

	private final ItemService itemService;

	private final ResourceManager resourceManager;

	public ResourceController(ItemService service, ResourceManager resourceManager) {
		this.itemService = service;
		this.resourceManager = resourceManager;
	}

	@GetMapping("/newTest/{itemId}")
	public Item getItemById(@PathVariable Long itemId){
		return itemService.findItemById(itemId);
	}


}
