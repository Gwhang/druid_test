package com.example.druid_test.dao;

import com.example.druid_test.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao {

    User queryById(String id);

}
