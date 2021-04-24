package pl.piatekd.osrsprices.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	@Value("${userAgent}")
    private String userAgent;

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplateBuilder(rt-> rt.getInterceptors().add((request, body, execution) -> {
	        request.getHeaders().add("User-Agent", userAgent);
	        return execution.execute(request, body);
	    })).build();
		return restTemplate;

	}
}
