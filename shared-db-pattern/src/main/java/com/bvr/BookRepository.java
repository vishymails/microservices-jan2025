package com.bvr;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{
	
	List<Book> findByName(String name);
	
	//snippet 
	//@Query("select u from Book u where u.name = :name")
	//List<Book> findBySpecialBook(String name);
}
