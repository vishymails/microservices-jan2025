package com.bvr;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SharedDbPatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SharedDbPatternApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(SharedDbPatternApplication.class);
	
	@Autowired
	private BookRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		log.info("DB Application has started");
		
		repository.save(new Book("Javascript"));
		repository.save(new Book("Python"));
		repository.save(new Book("PySpark"));
		repository.save(new Book("PyTorch"));
		repository.save(new Book("Java"));
		repository.save(new Book("Erlang"));
		repository.save(new Book("Scala"));
		repository.save(new Book("Golang"));
	
		
		log.info("find all records");
		
		repository.findAll().forEach(x -> System.out.println(x));
		
		
		log.info("find by id records");
		
		repository.findById(8L).ifPresent(x -> System.out.println(x));
		
		
		log.info("find by name records");
		
		repository.findByName("Python").forEach(x -> System.out.println(x));
		
		
		/*
		log.info("Delete by Book Id");
		
		Book bookToDelete = repository.findById(52L).get();
		
		System.out.println(bookToDelete.getName());
		
		repository.delete(bookToDelete);
		
	
		log.info("Delete book by title");
		
		repository.findByName("Java").forEach(book -> {
			System.out.println("Deleting book : " + book.getName());
			repository.delete(book);
		});
		
	
		log.info("Delete by book id");
		
		repository.deleteById(155L);
		
		
		
		
		log.info("Delete all by book id");
		
		repository.deleteAllById(Arrays.asList(203L, 204L, 209L, 252L, 253L));
		
		
		
		log.info("Delete all by book id");
		
		repository.deleteAll(repository.findByName("Javascript"));
		
		*/
		
		
		log.info("updating record");
		
		repository.findById(108L).ifPresent(x -> {
			System.out.println(x);
			x.setName("Scala - Spark");
			repository.save(x);
		});
		
		
	}

}
