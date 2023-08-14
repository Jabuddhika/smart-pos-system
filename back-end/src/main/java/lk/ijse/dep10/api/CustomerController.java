package lk.ijse.dep10.api;


import lk.ijse.dep10.business.CustomerBO;
import lk.ijse.dep10.dto.CustomerDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("v1/api/customers")
public class CustomerController {

 private final CustomerBO customerBO;

 public CustomerController(CustomerBO customerBO) {
  this.customerBO = customerBO;
 }

 @GetMapping
 public List<CustomerDTO> getCustomer() throws Exception {
   return customerBO.getCustomers();
 }



}
