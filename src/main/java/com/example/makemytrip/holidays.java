package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class holidays {
    @GetMapping("/myholidays")
    public String getData(){
        return  "Please book you holidays tickets from makemytrip";
    }
}
