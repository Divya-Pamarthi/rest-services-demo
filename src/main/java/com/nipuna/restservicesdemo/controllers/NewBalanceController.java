package com.nipuna.restservicesdemo.controllers;



//import com.nipuna.java.model.addition;
//import com.nipuna.java.model.UserDetails;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class NewBalanceController {

    @GetMapping("/stringdata")
    public @ResponseBody String getCustomerName() {
        return "Nipuna";
    }

    @GetMapping("/intdata")
    public @ResponseBody int getCustomerId() {
        return 04;
    }

    @GetMapping("/addition")
        public @ResponseBody Integer getCustomeradd()
        {
            Integer a=3;
            Integer b=2;
            return (a+b);
            Log.info("Addition");
        }
    }

