package lk.ijse.dep10.business;

import lk.ijse.dep10.dto.CustomerDTO;
import lk.ijse.dep10.entity.Customer;

import java.util.List;

public interface CustomerBO {

    List<CustomerDTO> getCustomers() throws Exception;

    CustomerDTO saveCustomer(CustomerDTO customerDTO) throws Exception;

}
