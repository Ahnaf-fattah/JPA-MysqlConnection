package io.learn.jpa.JPA.access.the.DB;

import io.learn.jpa.JPA.access.the.DB.model.siswa;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;

import io.learn.jpa.JPA.access.the.DB.repository.repository;


import java.util.Scanner;

@SpringBootApplication
public class JpaAccessTheDbApplication {
	private static final Logger log = LoggerFactory.getLogger(JpaAccessTheDbApplication.class);
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(JpaAccessTheDbApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(repository Repository) {
		return (args) -> {
			log.info("Input Your Data");
			log.info("---------------");
			String temp1,temp2;
			log.info("name");
			temp1= scan.nextLine();
			log.info("address ");
			temp2 = scan.nextLine();
			Repository.save(new siswa(temp1,temp2));
			//Output form database
			for (siswa Siswa : Repository.findAll()) {
				log.info(Siswa.toString());
			}
		};
	}
}
