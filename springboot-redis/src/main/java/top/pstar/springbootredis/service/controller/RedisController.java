package top.pstar.springbootredis.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.pstar.springbootredis.service.RedisService;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 18:04 2018/7/23
 */
@RestController
public class RedisController {
    @Autowired
    private RedisService redisService;
    @GetMapping("/add")
    public String add(String key,String value){
        redisService.setObject("name","zhangsan");
        return "success";
    }

}
