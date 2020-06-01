package com.douyu.choujiang.service;

import com.douyu.choujiang.entity.Award;

public interface AwardService {
    Award drawId(int drawId);

    void systemDraw(int awardId);
}
