package com.example.springmapstructexample.controller;

import com.example.springmapstructexample.dto.CustomerInfoDto;
import com.example.springmapstructexample.entity.CustomerEntity;
import com.example.springmapstructexample.service.ICustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

  private final ICustomerService customerService;

  public CustomerController(ICustomerService customerService) {
    this.customerService = customerService;
  }

  @PostMapping("/save")
  public ResponseEntity saveCustomer(@RequestBody CustomerEntity customerEntity) {
    customerService.addCustomer(customerEntity);
    return ResponseEntity.ok("Success");
  }

  @GetMapping("/getById/{customerId}")
  public ResponseEntity<CustomerInfoDto> getCustomerById(@PathVariable long customerId) {
    CustomerInfoDto customerInfo = customerService.getCustomerInfoById(customerId);
    return ResponseEntity.ok(customerInfo);
  }
}
