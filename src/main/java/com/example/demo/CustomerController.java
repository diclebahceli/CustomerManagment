package com.example.demo;

import com.example.demo.dto.HomeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public ResponseEntity<List<HomeDto>> getAllUsersHomeDTO() {
        List<HomeDto> customers = service.findAllHomeDto();
        return ResponseEntity.ok(customers);
    }

}
