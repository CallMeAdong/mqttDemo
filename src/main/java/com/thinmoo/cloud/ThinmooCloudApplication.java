package com.thinmoo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.thinmoo.cloud"})
public class ThinmooCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThinmooCloudApplication.class, args);
	}

}
