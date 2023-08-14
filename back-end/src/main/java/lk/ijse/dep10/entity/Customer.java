package lk.ijse.dep10.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Integer id;
    private String name;
    private String address;
    private String contact;
}
