package pl.piatekd.osrsprices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.piatekd.osrsprices.dto.ItemDTO;
import pl.piatekd.osrsprices.service.ItemService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/other")
@CrossOrigin(origins = "http://localhost:4200")
public class MiscellaneousController {

    private final ItemService itemService;

    public MiscellaneousController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/highVolume")
    public List<ItemDTO> getHighVolumeItems(){
        return itemService.getHighVolumeItems();
    }
}
