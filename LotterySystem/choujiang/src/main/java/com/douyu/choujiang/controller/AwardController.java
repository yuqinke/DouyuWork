package com.douyu.choujiang.controller;

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
/**
 * 先调用systemDraw方法生成系统获奖码
 * 再调用用户抽奖方法drawId，看是否中奖
 */
public class AwardController {

    @Autowired
    public AwardService awardService;

    //采用内存set存储获奖id,用户抽奖走内存set而不走数据库查询
    Set<Integer> set = new HashSet<>();

    @GetMapping("drawId")
    @ResponseBody
    //用户抽奖
    public  String drawId (){
        Random r = new Random();
        int drawId = r.nextInt(100)+1;//生成登录用户抽奖id
        System.out.println(drawId);
        if(set.contains(drawId)){
            set.remove(drawId);//删除已经中奖id
            return "恭喜您中奖了";
        }else {
            return "本次您没有中奖";
        }
    }

    @ResponseBody
    @RequestMapping("systemDraw")
    // 系统生成获奖id
    public  String  systemDraw(){
        Random r = new Random();
        while (set.size()<10){
            int awardId = r.nextInt(100)+1;
            set.add(awardId);
        }
        System.out.println();
        for(int awardId : set){
            awardService.systemDraw(awardId);
        }
        return "获奖id已经生成";
    }

}
