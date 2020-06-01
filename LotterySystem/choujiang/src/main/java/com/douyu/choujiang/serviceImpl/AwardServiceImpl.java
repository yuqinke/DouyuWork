package com.douyu.choujiang.serviceImpl;

import com.douyu.choujiang.dao.AwardDAO;
import com.douyu.choujiang.entity.Award;
import com.douyu.choujiang.service.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AwardServiceImpl implements AwardService {
    @Autowired
    public AwardDAO awardDAO;

    @Override
    public Award drawId(int drawId) {
       return awardDAO.drawId(drawId);
    }

    @Override
    public void systemDraw(int awardId) {
        awardDAO.systemDraw(awardId);
    }
}
