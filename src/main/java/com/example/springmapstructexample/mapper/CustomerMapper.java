package com.example.springmapstructexample.mapper;

import com.example.springmapstructexample.dto.CustomerInfoDto;
import com.example.springmapstructexample.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {

  CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

  CustomerInfoDto customerToCustomerInfo(CustomerEntity customerEntity);

  List<CustomerInfoDto> customerListToCustomerInfoList(List<CustomerEntity> customerEntityList);
}
