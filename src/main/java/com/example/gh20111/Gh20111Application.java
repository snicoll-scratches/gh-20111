package com.example.gh20111;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.soap.security.wss4j2.support.CryptoFactoryBean;

@EnableWs
@Configuration
@SpringBootApplication
public class Gh20111Application {

	public static void main(String[] args) {
		SpringApplication.run(Gh20111Application.class, args);
	}

	@Bean
	public CryptoFactoryBean cryptoFactoryBean() throws IOException {
		final CryptoFactoryBean cryptoFactoryBean = new CryptoFactoryBean();
		cryptoFactoryBean.setKeyStoreLocation(new FileSystemResource("/Users/snicoll/test.p12"));
		cryptoFactoryBean.setKeyStorePassword("private");
		cryptoFactoryBean.setKeyStoreType("PKCS12");

		return cryptoFactoryBean;
	}

}
