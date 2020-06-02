package com.douyu.choujiang;

import com.douyu.choujiang.dao.AwardDAO;
import com.douyu.choujiang.entity.Award;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@SpringBootTest(classes = ChoujiangApplication.class)
@RunWith(SpringRunner.class)
/**
 * 测试时先启动方法testGetAwardId，生成获奖id
 * 在启动用户抽奖方法testUserDraw进行抽奖
 */
public class TestAwardDAO {

    @Autowired
    private AwardDAO awardDAO;


    @Test
    //系统生成获奖id
    public void testGetAwardId(){
        Random r = new Random();
        Set<Integer> set = new HashSet<>();
        while (set.size()<10){
            int awardId = r.nextInt(100)+1;
            set.add(awardId);
        }
        for(int awardId : set){
            awardDAO.systemDraw(awardId);
            System.out.println(awardId);//打印id
        }
    }

    @Test
    //用户抽奖
    public  void testUserDraw(){
        Random r = new Random();
        int drawId = r.nextInt(100)+1;
        System.out.println(drawId);
        Award award = awardDAO.drawId(drawId);
        if(award!=null){
            System.out.println("恭喜您中奖了");
        }else {
            System.out.println("本次您没有中奖");
        }
    }

}
