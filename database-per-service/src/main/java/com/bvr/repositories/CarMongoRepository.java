package com.bvr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bvr.models.Car;

public interface CarMongoRepository extends CrudRepository<Car, String>{

}
