package com.example.druid_test.service;

import com.example.druid_test.dao.TestDao;
import com.example.druid_test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public User getUserById(String id){
       return this.testDao.queryById(id);
    }

}
