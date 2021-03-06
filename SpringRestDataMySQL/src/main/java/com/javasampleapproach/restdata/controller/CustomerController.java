package com.javasampleapproach.restdata.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.restdata.model.Customer;
import com.javasampleapproach.restdata.repository.PersonDAOImpl;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {
	List<Customer> customerList = new ArrayList<Customer>();
	
	@Autowired
	PersonDAOImpl personDAOImpl;
	
	@PostMapping(value = "/user")
    public void getPaymentCurrency(@RequestBody Customer customer) {
		System.out.println("getting the customer"+customer);
		//PersonDAOImpl personDAOImpl = new PersonDAOImpl();
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(8);
		customer.setId(randomInt);
		customerList.add(customer);
        personDAOImpl.saveCustomerDetails(customer);
		//return customerList;
    }
	
	@GetMapping(value = "/customerListabc")
    public Customer getPaymentCurrency1() {
		System.out.println("getPaymentCurrency");
		PersonDAOImpl personDAOImpl = new PersonDAOImpl();
        //return personDAOImpl.getCustomerDetails("abc@gmail.com");
		return null;
    }
}
