package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ImageDao;
import com.example.demo.model.Image;

@SpringBootApplication
public class ImageApplication implements CommandLineRunner{
	@Autowired
	private ImageDao imageDao;

	
	public static void main(String[] args) {
		SpringApplication.run(ImageApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		imageDao.save(new Image(UUID.fromString("39a084a2-ccaf-11ea-87d0-0242ac130003"), "demourl-1") );
		imageDao.save(new Image(UUID.randomUUID(),"demourl-2"));
	}

}
