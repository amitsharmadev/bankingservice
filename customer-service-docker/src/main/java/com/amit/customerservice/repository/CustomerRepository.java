/**
 * 
 */
package com.amit.customerservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.amit.customerservice.domain.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	Customer findByCustomerId(Integer customerId);
	
}
