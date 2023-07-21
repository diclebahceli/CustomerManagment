package com.example.demo;

import com.example.demo.customer.Customer;
import com.example.demo.dto.DetailDto;
import com.example.demo.dto.HomeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomerRepo repo;

    @Autowired
    public CustomerService(CustomerRepo repo) {
        this.repo = repo;
    }

    public DetailDto findDetailById(Long id) {
        Customer customer = repo.findDetailById(id);
        return convertCustomerToDetailDTO(customer);
    }

    private DetailDto convertCustomerToDetailDTO(Customer customer) {
        DetailDto detailDto = new DetailDto();
        detailDto.setId(customer.getId());
        detailDto.setMail(customer.getMail());
        detailDto.setName(customer.getName());
        detailDto.setStatus(customer.getStatus());
        return detailDto;
    }


    private HomeDto convertCustomerToHomeDTO(Customer customer) {
        HomeDto homeDto = new HomeDto();
        homeDto.setId(customer.getId());
        homeDto.setName(customer.getName());
        return homeDto;
    }


    public List<HomeDto> findAllHomeDto() {
        List<Customer> homeDtos = repo.findAll();
        return homeDtos.stream()
                .map(this::convertCustomerToHomeDTO)
                .collect(Collectors.toList());
    }


    }


