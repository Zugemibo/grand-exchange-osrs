package pl.piatekd.osrsprices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/docs")
@CrossOrigin(origins = "http://localhost:4200")
public class DocumentationController {

    public static final String HOST_NAME = "localhost:8080";

    @GetMapping("/")
    public Map<String, String> getEndpoints() {
        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("Get single item by ID.", HOST_NAME + "/v1/api/items/newTest/{itemId}");
        endpoints.put("Get items with matching item name.", HOST_NAME + "/api/v1/item/list/{itemName}");
        endpoints.put("Get single item by name", HOST_NAME + "/api/v1/item/{itemName}");
        endpoints.put("Items with largest margin.", HOST_NAME + "/api/v1/item/largestMargin");
        endpoints.put("Items with largest percentage margin.", HOST_NAME + "/api/v1/item/largestPercentageMargin");
        endpoints.put("High Alchemy.", HOST_NAME + "/api/v1/item/highAlch");
        return endpoints;
    }
}
