package com.example.springmapstructexample.serviceImpl;

import com.example.springmapstructexample.dto.CustomerInfoDto;
import com.example.springmapstructexample.entity.CustomerEntity;
import com.example.springmapstructexample.mapper.CustomerMapper;
import com.example.springmapstructexample.repository.CustomerRepository;
import com.example.springmapstructexample.service.ICustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

  private final CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public void addCustomer(CustomerEntity customerEntity) {
    customerRepository.save(customerEntity);
  }

  @Override
  public CustomerInfoDto getCustomerInfoById(long customerId) {
    CustomerEntity customerEntity = customerRepository.findById(customerId).orElse(null);
    return CustomerMapper.INSTANCE.customerToCustomerInfo(customerEntity);
  }
}
