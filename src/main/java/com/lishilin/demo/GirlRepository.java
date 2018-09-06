package com.lishilin.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//类名和id的类型
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    List<Girl> findByAge(Integer age);
}
