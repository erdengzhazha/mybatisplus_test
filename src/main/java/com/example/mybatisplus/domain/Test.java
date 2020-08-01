package com.example.mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("test")
public class Test {

    @TableId("id")
    private int id;
    @TableField("name")
    private String name;
    @TableField("createTime")
    private Date creatTime;


    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @TableField(exist = false)
    private String  kkk;

    public String getKkk() {
        return kkk;
    }

    public void setKkk(String kkk) {
        this.kkk = kkk;
    }

    public int getId() {
        return id;
    }

    public Test() {
    }

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
