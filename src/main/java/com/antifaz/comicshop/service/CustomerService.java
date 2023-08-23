package com.antifaz.comicshop.service;

import com.antifaz.comicshop.dao.Customer;
import com.antifaz.comicshop.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> findAllCustomer(){
        return customerRepository.findAll();
    }
}
