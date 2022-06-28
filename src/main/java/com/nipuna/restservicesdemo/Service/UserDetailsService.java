package com.nipuna.restservicesdemo.Service;

import com.nipuna.restservicesdemo.Model.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {
    public UserDetails getUserDetailsById(Integer custId)throws Exception {
        if(custId == 1) {
            return UserDetails.builder()
                    .username("Nipuna")
                    .email("Nipuna@gmail.com")
                    .build();
        }else if (custId == 2){
            return UserDetails.builder()
                    .username("Divya")
                    .email("Divya@gmail.com")
                    .build();
        }
        throw new Exception("Invalid details");
    }
}
