package com.nipuna.restservicesdemo.Model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class John {
    private Integer id;
    private String status;
    private Integer date;
    private Integer reference;
    private String customerReference;
    private Integer balance;
    private Integer customerBalance;
    private Integer addressId;
    private String firstName;
    private String lastName;

}
