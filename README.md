# spring-mapstruct-example

Generated source code :
```java
package com.example.springmapstructexample.mapper;

import com.example.springmapstructexample.dto.CustomerInfoDto;
import com.example.springmapstructexample.entity.CustomerEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-26T01:01:16+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.3.1 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerInfoDto customerToCustomerInfo(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        CustomerInfoDto customerInfoDto = new CustomerInfoDto();

        customerInfoDto.setName( customerEntity.getName() );
        customerInfoDto.setSurname( customerEntity.getSurname() );
        customerInfoDto.setAge( customerEntity.getAge() );
        customerInfoDto.setGender( customerEntity.getGender() );

        return customerInfoDto;
    }

    @Override
    public List<CustomerInfoDto> customerListToCustomerInfoList(List<CustomerEntity> customerEntityList) {
        if ( customerEntityList == null ) {
            return null;
        }

        List<CustomerInfoDto> list = new ArrayList<CustomerInfoDto>( customerEntityList.size() );
        for ( CustomerEntity customerEntity : customerEntityList ) {
            list.add( customerToCustomerInfo( customerEntity ) );
        }

        return list;
    }
}
```
