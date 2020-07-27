package com.example.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.example.mybatisplus.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ByWrapper {

    @Resource()
    private TestMapper testMapper;
    @Test
    public void Test(){
        QueryWrapper<com.example.mybatisplus.domain.Test> testQueryWrapper = new QueryWrapper<com.example.mybatisplus.domain.Test>();
       // testQueryWrapper.like("name","0").lt("id",5);
        //testQueryWrapper.like("name","0").between("id",2,3).isNotNull("name");
        //以测试为性， id >=2，按照id 降序排序， id相同按照 名字排序
        //testQueryWrapper.like("name","测%").ge("id",2).orderByDesc("id").orderByAsc("name");
        //日期 2019年 -02-05
        //testQueryWrapper.apply("date_format(creatTime,'%Y-%m-%d') = {0}", "2020-06-04").inSql("id","select id from test");
        //年龄作为 测 性，并且 （id<4或者时间不为空）
        //testQueryWrapper.like("name","测%").and(q ->q.lt("id",4).or().isNotNull("creatTime"));
        //名字为 测或者  （id 《4 并且 id》1 并且 时间不为空）
        //testQueryWrapper.eq("name","测试04").or(q ->q.lt("id",4).gt("id",1).isNotNull("creatTime"));
        //  (id <4 或者时间不为空) 并且 名字为 测试04
//        testQueryWrapper.nested(q ->q.lt("id",4)
//            .isNotNull("creatTime")
//        ).like("name","测试");
        // id in (20,30,40) 并且返回最后一个值
        //testQueryWrapper.in("id", Arrays.asList(1,2,5)).orderByDesc("id").last("limit 1");

        // 查询出指定字段
        //testQueryWrapper.like("name","测试")
//            .select(com.example.mybatisplus.domain.Test.class,p -> !p.getColumn().equals("creatTime")
//            && !p.getColumn().equals("name")
//            )
        ;

//        List<com.example.mybatisplus.domain.Test> tests = testMapper.selectList(testQueryWrapper);
//        for (com.example.mybatisplus.domain.Test t:
//             tests) {
//            System.out.println(t.getId() + " "+t.getName()+ ""+t.getCreatTime());
//        }


        //查询返回的是一个统计结果 ，
        //统计id为多少
        testQueryWrapper.select("sum(id) sumid,avg(id) avid").groupBy("id").having("sum(id)>{0}",3);

        List<Map<String, Object>> maps = testMapper.selectMaps(testQueryWrapper);

        System.out.println("总共机"+maps.size());
        for (Map<String,Object> t:
            maps) {
            System.out.println(t.get("sumid")+" "+t.get("avid"));
        }
        //langbuda 的写法
//        List<com.example.mybatisplus.domain.Test> test = new LambdaQueryChainWrapper<com.example.mybatisplus.domain.Test>(testMapper)
//                .like(com.example.mybatisplus.domain.Test::getName, "测试")
//                .list();
//        for (com.example.mybatisplus.domain.Test t:
//             test) {
//            System.out.println(t.getId() + " "+t.getName()+ ""+t.getCreatTime());
//        }
    }
}
