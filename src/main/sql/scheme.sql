CREATE  DATABASE seckill;

use seckill;

CREATE TABLE seckill(
seckill_id bigint NOT NULL AUTO_INCREMENT,
name VARCHAR (120) NOT NULL,
number int NOT NULL,
start_time TIMESTAMP NOT NULL,
end_time TIMESTAMP  NOT NULL,
create_time TIMESTAMP NOT NULL,
PRIMARY KEY(seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 COMMENT '秒杀库存表';

INSERT  INTO seckill(name,number,start_time,end_time,create_time)
VALUES
('1000 iphone6',100,'2015-11-01 00:00;00','2015-11-02 00:00:00','2015-11-01 09:00:00'),
('100 xiaomi',200,'2015-11-01 00:00;00','2015-11-02 00:00:00','2015-11-01 09:00:00'),
('300 huawei',300,'2015-11-01 00:00;00','2015-11-02 00:00:00','2015-11-01 09:00:00'),
('500 meizu',400,'2015-11-01 00:00;00','2015-11-02 00:00:00','2015-11-01 09:00:00');

CREATE  TABLE success_killed(
'seckill_id' bigint NOT NULL,
'user_phone' bigint NOT NULL,
'state' tinyint NOT NULL DEFAULT  -1,
'create_time' TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP ,
PRIMARY KEY(seckill_id,user_phone),  /*联合主键*/
key idx_create_time(create_time),
)ENGINE=InnoDB DEFAULT CHARSET=utf-8 COMMENT '秒杀成功明细表';