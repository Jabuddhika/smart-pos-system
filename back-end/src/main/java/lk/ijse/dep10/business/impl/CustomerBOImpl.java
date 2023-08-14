package lk.ijse.dep10.business.impl;

import lk.ijse.dep10.business.CustomerBO;
import lk.ijse.dep10.business.util.Transformer;
import lk.ijse.dep10.dao.CustomerDAO;
import lk.ijse.dep10.dto.CustomerDTO;
import lk.ijse.dep10.entity.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerBOImpl implements CustomerBO {

    private final CustomerDAO customerDAO;

    private final Transformer transformer;

    public CustomerBOImpl(CustomerDAO customerDAO, Transformer transformer) {
        this.customerDAO = customerDAO;
        this.transformer = transformer;
    }


    @Override
    public List<CustomerDTO> getCustomers() throws Exception {
      return  customerDAO.getCustomers().stream().map(transformer::fromEntity).collect(Collectors.toList());
    }
}
