package com.example.shipavailability.shipavailability.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.shipavailability.shipavailability.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
