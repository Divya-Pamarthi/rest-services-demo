package com.nipuna.restservicesdemo.controllers;

import com.nipuna.restservicesdemo.Model.UserDetails;
import com.nipuna.restservicesdemo.Service.UserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class UserDetailsControllers
{
    private final UserDetailsService userdetails;
    @GetMapping("/getuserdetails/{userId}")
    public @ResponseBody
    UserDetails getUserDetailsById(@PathVariable("userId") Integer userId) throws Exception{
            return userdetails.getUserDetailsById(userId);
}
}
