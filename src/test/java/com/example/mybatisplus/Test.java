package com.example.mybatisplus;

import com.example.mybatisplus.mapper.TestMapper;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Resource
    private TestMapper testMapper;
    @org.junit.Test
    public void select(){
        //List<com.example.mybatisplus.domain.Test> list = testMapper.selectList(null);
        //Assert.assertEquals(5,list.size());
//        for (com.example.mybatisplus.domain.Test t:
//             list) {
//            System.out.println(t.getId() + " "+t.getName());
//        }
//        int a = testMapper.insert(new com.example.mybatisplus.domain.Test(5, "测试04"));
//        Assert.assertEquals(1,a);

        //--------selectby Id  查找主键 单个
//        com.example.mybatisplus.domain.Test test = testMapper.selectById(2);
//        System.out.println(test.getName());
        //selectBatchIds  查找主键 多个
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        List<com.example.mybatisplus.domain.Test> tests = testMapper.selectBatchIds(list);
//        for (com.example.mybatisplus.domain.Test t:
//             tests) {
//            System.out.println(t.getName()+" "+t.getId());
//        }

        // -------selectByMap
//        HashMap<String,Object> map = new HashMap();
//        //map.put("name","测试04");
//        map.put("name","连连看");
//        List<com.example.mybatisplus.domain.Test> tests = testMapper.selectByMap(map);
//        for (com.example.mybatisplus.domain.Test t:
//             tests) {
//            System.out.println(t.getName()+" "+t.getId());
//        }

    }

}
