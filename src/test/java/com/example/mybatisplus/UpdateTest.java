package com.example.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.mybatisplus.domain.TestUpdate;
import com.example.mybatisplus.mapper.TestUpdateMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UpdateTest {
    @Autowired
    private TestUpdateMapper testUpdateMapper;

    @Test
    public void updateWrapper(){
        //TestUpdate testUpdate = new TestUpdate();
        //testUpdate.setName("这是updateWrapper修改的值");
        //通过id ，修改值
        //testUpdateMapper.updateById(testUpdate);

        UpdateWrapper<TestUpdate> updateWrapper = new UpdateWrapper<TestUpdate>();
        updateWrapper.eq("id",2).set("name","我又换名字了!");
        //使用update
        testUpdateMapper.update(null,updateWrapper);
    }
    @Test
    public void lambdaUpdate(){
        LambdaUpdateWrapper<TestUpdate> lambdaUpdateWrapper = new LambdaUpdateWrapper<>();
        lambdaUpdateWrapper.eq(TestUpdate::getId,2).set(TestUpdate::getName,"我tm又欢乐!");
    }
}
