package com.example.mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.time.LocalDateTime;
import java.util.Date;

@TableName("test")
public class TestAR extends Model<TestAR> {

    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Integer id;
    @TableField("name")
    private String name;
    /**创建时间*/
    @TableField(value = "createTime",fill = FieldFill.INSERT) //新增的时候填充
    private LocalDateTime createTime;
    /**修改时间*/
    @TableField(value = "updateTime",fill = FieldFill.UPDATE) //修改的时候填充
    private LocalDateTime updateTime;
    /**删除标识*/
    @TableField(select = false)
    @TableLogic
    private Integer deleted;

    public TestAR(Integer id, String name, LocalDateTime createTime, LocalDateTime updateTime, Integer deleted) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleted = deleted;
    }

    public TestAR() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "TestAR{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", deleted=" + deleted +
                '}';
    }
}
