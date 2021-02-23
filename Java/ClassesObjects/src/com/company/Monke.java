package com.company;

public class Monke {
    private int mId;
    private String mName;
    private int mStrength;
    private int mSpeed;
    private int mIntellect;

    public Monke(int mId, String mName, int mStrength, int mSpeed, int mIntellect) {
        this.mId = mId;
        this.mName = mName;
        this.mStrength = mStrength;
        this.mSpeed = mSpeed;
        this.mIntellect = mIntellect;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmStrength() {
        return mStrength;
    }

    public void setmStrength(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getmSpeed() {
        return mSpeed;
    }

    public void setmSpeed(int mSpeed) {
        this.mSpeed = mSpeed;
    }

    public int getmIntellect() {
        return mIntellect;
    }

    public void setmIntellect(int mIntellect) {
        this.mIntellect = mIntellect;
    }
}
