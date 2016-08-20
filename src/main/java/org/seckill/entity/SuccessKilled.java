package org.seckill.entity;

import java.util.Date;

/**
 * Created by linlong on 2016/5/28.
 */
public class SuccessKilled {
    private long seckillId;

    private long userPhone;

    public SecKill getSeckill() {
        return seckill;
    }

    public void setSeckill(SecKill seckill) {
        this.seckill = seckill;
    }

    private short state;

    private Date createTime;

    private SecKill seckill;

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
