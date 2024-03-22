package com.kt.edu.thirdproject.employee.query.service;

import com.kt.edu.thirdproject.employee.feign.EduFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignTestService {
    @Autowired
    EduFeignClient eduFeignClient;

    public String getUsers() {
        return eduFeignClient.getUsers(); //feign client 에서 method 를 호출한다.
    }
}