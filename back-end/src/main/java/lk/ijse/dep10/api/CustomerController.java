package lk.ijse.dep10.api;


import lk.ijse.dep10.business.CustomerBO;
import lk.ijse.dep10.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

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

 @PostMapping
 public CustomerDTO saveCustomer(@RequestBody CustomerDTO customer) throws Exception {
   return customerBO.saveCustomer(customer);

 }





}
