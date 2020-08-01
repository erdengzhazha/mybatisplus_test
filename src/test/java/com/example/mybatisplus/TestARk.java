package com.example.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.mybatisplus.domain.TestAR;
import com.example.mybatisplus.mapper.TestARMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestARk {

    @Autowired
    private TestARMapper testARMapper;

    @Test
    public void insert(){
        //TestUpdate chenwei = new TestUpdate(1, "陈炜", new Date());
        TestAR testAR = new TestAR();
        testAR.setName("测试insert,测试优化");
        testAR.setUpdateTime(LocalDateTime.of(2020,10,2,2,2,2,2));
        //testAR.setName("叫我爸3");
        //TestAR testAR1 = testAR.selectById(8);
        //System.out.println(testAR1.toString());
        //System.out.println(testAR.getId());
//        TestAR testAR = new TestAR();
//        testAR.setId(2);
//        //testAR.setId(2);
//        TestAR testAR1 = testAR.selectById();
//        System.out.println(testAR1.toString());

        //testAR.setId(7);
        //testAR.setDeleted(0);
        UpdateWrapper<TestAR> updateWrapper = new UpdateWrapper();
        updateWrapper.eq("id",11);
        //testARMapper.insert(testAR);
        //boolean b = testAR.updateById();
        //boolean b = testAR.update(updateWrapper);
       // System.out.println(b);
        testARMapper.update(testAR,updateWrapper);

    }
}
