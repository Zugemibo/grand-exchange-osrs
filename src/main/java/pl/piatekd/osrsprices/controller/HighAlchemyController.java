package pl.piatekd.osrsprices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.piatekd.osrsprices.dto.HighAlchItemDTO;
import pl.piatekd.osrsprices.service.HighAlchService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/high_alchemy")
@CrossOrigin(origins = "http://localhost:4200")
public class HighAlchemyController {


    private final HighAlchService highAlchService;

    public HighAlchemyController(HighAlchService highAlchService) {
        this.highAlchService = highAlchService;
    }


    @GetMapping("/")
    public List<HighAlchItemDTO> getBestHighAlchItems() {
        List<HighAlchItemDTO> highAlchItemDTOList = highAlchService.getHighAlchItems();
        for(HighAlchItemDTO dto:highAlchItemDTOList){
            System.out.println(dto);
        }
        return highAlchItemDTOList;
    }

    @GetMapping("/getNatureRunePrice")
    public int getNatureRunePrice() {
        return highAlchService.getNatureRunePrice();
    }
}
