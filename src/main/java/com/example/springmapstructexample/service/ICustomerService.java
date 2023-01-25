package com.example.springmapstructexample.service;

import com.example.springmapstructexample.dto.CustomerInfoDto;
import com.example.springmapstructexample.entity.CustomerEntity;

public interface ICustomerService {

  void addCustomer(CustomerEntity customerEntity);

  CustomerInfoDto getCustomerInfoById(long customerId);
}
