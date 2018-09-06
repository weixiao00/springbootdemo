package com.lishilin.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @RequestMapping(value = "/girls")
    public List<Girl> getAll(){
        return girlRepository.findAll();
    }

    @GetMapping(value = "/setgirl")
    public Girl setGirl(@RequestParam(value = "cupSize") String cupSize,
                         @RequestParam(value = "age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        System.out.println(girl);
        return girlRepository.save(girl);
    }

    @GetMapping(value = "/getgirl/{id}")
    public Optional<Girl> getGirl(@PathVariable(value = "id") Integer myId){
        return girlRepository.findById(myId);
    }
    @GetMapping(value = "deletegirl/{id}")
    public void deletegirl(@PathVariable(value = "id") Integer myId){
        girlRepository.deleteById(myId);
    }

    @RequestMapping(value = "age/{age}")
    public List<Girl> getGirlByAge(@PathVariable(value = "age") Integer myAge){
        List<Girl> list = girlRepository.findByAge(myAge);
        return list;
    }

    @RequestMapping(value = "insert")
    public void insertTwo(){
        girlService.insertTwo();
    }
}
