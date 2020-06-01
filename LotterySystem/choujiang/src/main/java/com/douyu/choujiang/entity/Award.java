package com.douyu.choujiang.entity;

public class Award {
    int id;
    int awardId;

    public Award() {
    }

    public Award(int id, int awardId) {
        this.id = id;
        this.awardId = awardId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAwardId() {
        return awardId;
    }

    public void setAwardId(int awardId) {
        this.awardId = awardId;
    }

    @Override
    public String toString() {
        return "Award{" +
                "id=" + id +
                ", awardId=" + awardId +
                '}';
    }
}
