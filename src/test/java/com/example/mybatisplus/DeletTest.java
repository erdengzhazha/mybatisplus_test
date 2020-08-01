package com.example.mybatisplus;

import com.example.mybatisplus.mapper.TestUpdateMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeletTest {

    @Autowired
    private TestUpdateMapper testUpdateMapper;

    @Test
    public void delet(){
        testUpdateMapper.deleteById(1);
    }
}
