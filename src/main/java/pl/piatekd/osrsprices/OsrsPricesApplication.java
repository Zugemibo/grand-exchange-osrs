package pl.piatekd.osrsprices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OsrsPricesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsrsPricesApplication.class, args);
	}

}
