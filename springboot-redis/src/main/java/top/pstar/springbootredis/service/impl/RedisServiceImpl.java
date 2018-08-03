package top.pstar.springbootredis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import top.pstar.springbootredis.service.RedisService;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 14:21 2018/7/23
 */
@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void setObject(String key, Object value) {
        String stringValue = (String) value;
        stringRedisTemplate.opsForValue().set(key, stringValue);
    }
}
