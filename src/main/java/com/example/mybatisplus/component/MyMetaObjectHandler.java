package com.example.mybatisplus.component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    //实体类中的字段名

    @Override
    public void insertFill(MetaObject metaObject) {
        if(metaObject.hasSetter("createTime")){
            setInsertFieldValByName("createTime", LocalDateTime.now(),metaObject);
            //setFieldValByName()
        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if(metaObject.hasSetter("updateTime")){
            if(getFieldValByName("updateTime",metaObject)==null) {
                setUpdateFieldValByName("updateTime", LocalDateTime.now(), metaObject);
            }
        }
    }
}
