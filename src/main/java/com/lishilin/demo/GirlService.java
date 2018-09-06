package com.lishilin.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("H");
        girlA.setAge(12);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("Guuuu");
        girlB.setAge(13);
        girlRepository.save(girlB);

    }
}
