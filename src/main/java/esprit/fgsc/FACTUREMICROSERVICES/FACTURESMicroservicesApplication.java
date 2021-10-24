package esprit.fgsc.FACTUREMICROSERVICES;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FACTURESMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FACTURESMicroservicesApplication.class, args);
	}

}
