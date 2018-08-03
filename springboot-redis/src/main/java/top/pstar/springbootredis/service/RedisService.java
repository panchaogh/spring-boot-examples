package top.pstar.springbootredis.service;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 14:19 2018/7/23
 */
public interface RedisService {
    void setObject(String key, Object value);
}
