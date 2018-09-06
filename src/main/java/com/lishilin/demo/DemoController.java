package com.lishilin.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public GirlProperties demo(){
        return girlProperties;
    }


}
