package com.baizhi.cmfz.entity;

import java.io.Serializable;

/**
 * Created by 21522 on 2018/7/4.
 */
public class Manager implements Serializable{
    private Integer mId;
    private String mName;
    private String mSalt;
    private String mStatus;
    private String mPassword;

    public Manager() {
    }

    public Manager(Integer mId, String mName, String mSalt, String mStatus, String mPassword) {
        this.mId = mId;
        this.mName = mName;
        this.mSalt = mSalt;
        this.mStatus = mStatus;
        this.mPassword = mPassword;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mSalt='" + mSalt + '\'' +
                ", mStatus='" + mStatus + '\'' +
                ", mPassword='" + mPassword + '\'' +
                '}';
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmSalt() {
        return mSalt;
    }

    public void setmSalt(String mSalt) {
        this.mSalt = mSalt;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }


}
