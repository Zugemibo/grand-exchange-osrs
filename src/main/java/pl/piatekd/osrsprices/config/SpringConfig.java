package pl.piatekd.osrsprices.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import pl.piatekd.osrsprices.util.ResourceManager;

@Configuration
@EnableScheduling
public class SpringConfig {

    @Value("${cron.itemTradeVolumes.enabled}")
    private boolean itemtradeVolumesEnabled;

    @Value("${cron.itemPrices.enabled}")
    private boolean itemPricesEnabled;

    private final ResourceManager resourceManager;

    public SpringConfig(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
    }


    @Scheduled(fixedDelayString = "${cron.itemPrices.interval}")
    public void scheduleItemPrices() throws Exception {
        if (itemPricesEnabled) {
            resourceManager.getLatestDataPrices();
        }
    }

    @Scheduled(fixedDelayString = "${cron.itemTradeVolumes.interval}")
    public void scheduleItemTradeVolumes() throws Exception {
        if (itemtradeVolumesEnabled) {
            resourceManager.getLatestDataVolumes();
        }
    }

}
