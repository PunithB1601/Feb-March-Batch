package com.dcl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dcl.entity.Movie;
import com.dcl.repository.MovieRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		MovieRepository mdao=context.getBean(MovieRepository.class);
	/*	
		mdao.findByMovieName("Om").forEach(System.out::println);
		mdao.findByLanguage("Kannada").forEach(System.out::println);
		mdao.findByMovieNameStartsWith("O").forEach(System.out::println);
		mdao.findByMovieIdGreaterThan(2).forEach(System.out::println);
		mdao.findByMovieNameAndLanguage("Odyssey", "English").forEach(System.out::println);
	*/	
		mdao.getByMovieName("Kantara").forEach(System.out::println);
		mdao.getByCertification("A").forEach(System.out::println);
		mdao.getByLanguage("English").forEach(System.out::println);
		

		
		
		
		
		
		
		
	}

}
