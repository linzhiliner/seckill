package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * Created by linlong on 2016/5/28.
 */
public interface SuccessKillDao {

    int insertSuccessKillId(long seckillId,long userPhone);

    SuccessKilled queryByIdWithSecKill(long seckillId);
}
