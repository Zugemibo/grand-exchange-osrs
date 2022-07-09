package pl.piatekd.osrsprices.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pl.piatekd.osrsprices.dto.ItemDTO;
import pl.piatekd.osrsprices.exception.ItemNotFoundException;
import pl.piatekd.osrsprices.service.ItemService;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/v1/item")
@CrossOrigin(origins = "http://localhost:4200")
public class ItemController {

    private static final String BASE_URL = "https://prices.runescape.wiki/api/v1/osrs/";

    private final ItemService itemService;
    private final RestTemplate template;

    public ItemController(ItemService itemService, RestTemplate template) {
        this.itemService = itemService;
        this.template = template;
    }

    @GetMapping("/list/{itemName}")
    public List<ItemDTO> getItemListByName(@PathVariable String itemName) {
        try {
            return itemService.getItemByName(itemName);
        } catch (Exception e) {
            throw new ItemNotFoundException();
        }
    }

    @GetMapping("/largestMargin/{nonMemberItemsOnly}/{isPercentMargin}")
    public List<ItemDTO> getItemsWithLargestMargin(@PathVariable boolean nonMemberItemsOnly, @PathVariable boolean isPercentMargin){
        try {
            return itemService.getItemsWithLargestMargin(nonMemberItemsOnly, isPercentMargin);
        } catch (Exception e) {
            throw new ItemNotFoundException();
        }
    }

    @GetMapping("/suggestedItems/{includeMemberItems}")
    public List<ItemDTO> getSuggestedItemsWithMembership(@PathVariable boolean includeMemberItems){
        try {
            return itemService.getSuggestedItems(includeMemberItems);
        } catch (Exception e) {
//            throw new Exception(e.getMessage());
            throw new ItemNotFoundException();
        }
    }

}
