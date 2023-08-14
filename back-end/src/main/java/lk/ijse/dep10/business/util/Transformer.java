package lk.ijse.dep10.business.util;

import lk.ijse.dep10.dto.CustomerDTO;
import lk.ijse.dep10.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Transformer {


    ModelMapper mapper=new ModelMapper();

    public CustomerDTO fromEntity(Customer customer){
       return mapper.map(customer, CustomerDTO.class);
    }

    public Customer toEntity(CustomerDTO customerDTO){
        return mapper.map(customerDTO, Customer.class);
    }
}
