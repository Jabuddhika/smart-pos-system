package lk.ijse.dep10.dao;

import lk.ijse.dep10.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers() throws Exception;

    Customer saveCustomer(Customer customer) throws Exception;
}
