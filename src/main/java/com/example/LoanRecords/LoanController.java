package com.example.LoanRecords;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping
@Controller
public class LoanController {

    @RequestMapping(value = "/loantable", method = RequestMethod.GET)
    public String showLoantablepage() {
        return "loantable";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoantablepage2() {
        return "loantable";
    }

}
