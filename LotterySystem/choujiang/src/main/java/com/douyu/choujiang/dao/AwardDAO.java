package com.douyu.choujiang.dao;

import com.douyu.choujiang.entity.Award;

public interface AwardDAO {
    Award drawId(int drawId);

    void systemDraw(int awardId);
}
