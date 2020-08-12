package io.github.olgamaciaszek.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Olga Maciaszek-Sharma
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationServerApplication.class, args);
	}
}