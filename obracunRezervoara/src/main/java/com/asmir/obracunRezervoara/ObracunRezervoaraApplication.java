package com.asmir.obracunRezervoara;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.asmir.obracunRezervoara.entity.Rezervoar2;
import com.asmir.obracunRezervoara.entity.Rezervoar3;
import com.asmir.obracunRezervoara.entity.Rezervoar4;
import com.asmir.obracunRezervoara.service.RezervoarServiceImpl;

@SpringBootApplication
public class ObracunRezervoaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObracunRezervoaraApplication.class, args);
	}

}