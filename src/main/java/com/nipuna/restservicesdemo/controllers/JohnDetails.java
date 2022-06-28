package com.nipuna.restservicesdemo.controllers;

import com.nipuna.restservicesdemo.Model.John;
import com.nipuna.restservicesdemo.Model.UserDetails;
import com.nipuna.restservicesdemo.Service.JohnSer;
import com.nipuna.restservicesdemo.Service.UserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class JohnDetails {

    @Controller
    @AllArgsConstructor
    public class UserDetailsControllers
    {
        private final JohnSer customerdetails;
        @GetMapping("/getuserdetails/{userId}")
        public @ResponseBody
        John getJohnById(@PathVariable("userId") Integer userId) throws Exception{
            return customerdetails.getJohnById(userId);
        }
    }


}
