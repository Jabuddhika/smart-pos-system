package lk.ijse.dep10.dao.impl;

import lk.ijse.dep10.dao.CustomerDAO;
import lk.ijse.dep10.entity.Customer;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDAOImpl implements CustomerDAO {

    private final BasicDataSource pool;

    public CustomerDAOImpl(BasicDataSource pool) {
        this.pool = pool;
    }


    @Override
    public List<Customer> getCustomers() throws Exception {
        Connection connection = pool.getConnection();
        PreparedStatement pst = connection.prepareStatement("SELECT * FROM dep10_pos.customer");
        ResultSet rst=pst.executeQuery();
        List<Customer> customerList=new ArrayList<>();
        while (rst.next()){
            int id = rst.getInt(1);
            String name = rst.getString(2);
            String address = rst.getString(3);
            String contact = rst.getString(4);
            Customer customer=new Customer(id,name,address,contact);
            customerList.add(customer);

        }

        return customerList;
    }

    @Override
    public Customer saveCustomer(Customer customer) throws Exception {
        Connection connection = pool.getConnection();
        PreparedStatement pst = connection.prepareStatement("INSERT INTO dep10_pos.customer(name, address, contact) VALUES (?,?,?)",Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, customer.getName());
        pst.setString(2, customer.getAddress());
        pst.setString(3,customer.getContact());
        pst.executeUpdate();
        ResultSet rst=pst.getGeneratedKeys();
        rst.next();
        int id = rst.getInt(1);

        Customer customer1=new Customer(id,customer.getName(), customer.getAddress(), customer.getContact());
        return customer1;
    }
}
