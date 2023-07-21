package com.example.demo;

import com.example.demo.customer.Customer;
import com.example.demo.dto.DetailDto;
import com.example.demo.dto.HomeDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
    Customer findDetailById(Long id);
    List<Customer> findAll();


}
