package com.douyu.choujiang.controller;

import com.douyu.choujiang.entity.Award;
import com.douyu.choujiang.service.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Controller
@RequestMapping("draw")
public class AwardController {

    @Autowired
    public AwardService awardService;

    @GetMapping("drawId")
    @ResponseBody
    //用户抽奖
    public String drawId (){
        Random r = new Random();
        int drawId = r.nextInt(1000)+1;
        System.out.println(drawId);
        Award award = awardService.drawId(drawId);
       // System.out.println(award.toString());空对象不能tostring，否则报错
        if(award!=null){
            return "恭喜您中奖了";
        }else {
            return "本次您没有中奖";
        }
    }

    @ResponseBody
    @RequestMapping("systemDraw")
    // 系统生成获奖id
    public String  systemDraw(){
        Random r = new Random();
        Set<Integer> set = new HashSet<>();
        while (set.size()<10){
            int awardId = r.nextInt(1000)+1;
            set.add(awardId);
        }
        for(int awardId : set){
            awardService.systemDraw(awardId);
        }
        return "获奖id已经生成";
    }

}
