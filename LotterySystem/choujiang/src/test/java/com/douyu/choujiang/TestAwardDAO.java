package com.douyu.choujiang;

import com.douyu.choujiang.dao.AwardDAO;
import com.douyu.choujiang.entity.Award;
import com.douyu.choujiang.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

@SpringBootTest(classes = ChoujiangApplication.class)
@RunWith(SpringRunner.class)
public class TestAwardDAO {

    @Autowired
    private AwardDAO awardDAO;

    @Test
    //系统生成获奖id
    public void testGetAwardId(){
        Random r = new Random();
        Set<Integer> set = new HashSet<>();
        while (set.size()<10){
            int awardId = r.nextInt(1000)+1;
            set.add(awardId);
        }
        for(int awardId : set){
            awardDAO.systemDraw(awardId);
            System.out.println(awardId);
        }
    }

    @Test
    //用户抽奖
    public  void testUserDraw(){
        Random r = new Random();
        int drawId = r.nextInt(1000)+1;
        System.out.println(drawId);
        Award award = awardDAO.drawId(drawId);
        if(award!=null){
            System.out.println("恭喜您中奖了");
        }else {
            System.out.println("本次您没有中奖");
        }
    }

}
