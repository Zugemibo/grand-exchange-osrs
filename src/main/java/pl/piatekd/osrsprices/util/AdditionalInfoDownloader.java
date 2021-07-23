//package pl.piatekd.osrsprices.util;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.web.client.RestTemplate;
//import pl.piatekd.osrsprices.config.RestTemplateConfig;
//import pl.piatekd.osrsprices.model.AdditionalInfo;
//import pl.piatekd.osrsprices.service.AdditionalInfoService;
//import pl.piatekd.osrsprices.service.ItemService;
//
//import java.util.List;
//
//@SpringBootApplication
//@ComponentScan(basePackageClasses = {AdditionalInfoService.class, RestTemplateConfig.class})
//@EntityScan("pl.piatekd.osrsprices.model")
//@EnableJpaRepositories("pl.piatekd.osrsprices.repository")
//public class AdditionalInfoDownloader implements CommandLineRunner {
//
//    @Autowired
//    private AdditionalInfoService additionalInfoService;
//    @Autowired
//    private ItemService itemService;
//    @Autowired
//    private RestTemplate restTemplate;
//
//
//    public void getDataFromAPI() {
//
//        List<Long> itemIdList = getIdList();
//
//        for (Long itemId : itemIdList) {
//            AdditionalInfo additionalInfo = restTemplate.getForObject("https://www.osrsbox.com/osrsbox-db/items-json/" + itemId + ".json", AdditionalInfo.class);
//
//            System.out.println("Zapisuje " + itemId);
//            additionalInfoService.save(additionalInfo);
//        }
//
//    }
//
//    public List<Long> getIdList() {
//        return itemService.getAllIds();
//    }
//
//
//    public static void main(String[] args) {
//        SpringApplication.run(pl.piatekd.osrsprices.util.AdditionalInfoDownloader.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        getDataFromAPI();
//
//    }
//}
//
//
//
