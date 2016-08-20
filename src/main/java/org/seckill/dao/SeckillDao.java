package org.seckill.dao;

import org.seckill.entity.SecKill;

import java.util.Date;
import java.util.List;

/**
 * Created by linlong on 2016/5/28.
 */
public interface SeckillDao {

    int reduceNumber(long seckillId,Date killTime);

    SecKill queryById(long seckillId);

    List<SecKill> queryAll(int offset,int limit);
}
