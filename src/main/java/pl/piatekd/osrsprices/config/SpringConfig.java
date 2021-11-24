package pl.piatekd.osrsprices.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import pl.piatekd.osrsprices.util.ResourceManager;

@Configuration
@EnableScheduling
public class SpringConfig {

    @Value("${cron.enabled}")
    private boolean enabled;

    private final ResourceManager resourceManager;

    public SpringConfig(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
    }


    @Scheduled(fixedDelay = 300000)
    public void scheduleItemPrices() throws Exception {
        if (enabled) {
            resourceManager.getLatestDataPrices();
        }
    }
    @Scheduled(fixedDelay = 300000)
    public void scheduleItemTradeVolumes() throws Exception {
        if (enabled) {
            resourceManager.getLatestDataVolumes();
        }
    }

}
