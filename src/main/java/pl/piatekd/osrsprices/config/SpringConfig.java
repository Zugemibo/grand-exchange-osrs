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


    @Scheduled(fixedDelay = 120000)
    public void scheduleFixedDelayTask() throws Exception {
        if (enabled) {
            resourceManager.getDataFromApi();
        }
    }

}
