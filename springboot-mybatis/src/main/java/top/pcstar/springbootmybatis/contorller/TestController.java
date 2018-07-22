package top.pcstar.springbootmybatis.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.pcstar.springbootmybatis.entity.Test;
import top.pcstar.springbootmybatis.service.TestService;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 16:37 2018/7/17
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @Autowired
    private CacheManager cacheManager;

    @GetMapping("/getTestByName")
    public Test getTestByName(String name) {
        System.out.println("getTestByName");
        return testService.getTestByName(name);
    }

    @GetMapping("/addTest")
    public void addTest(String name, String sex) {
        testService.addTest(name, sex);
    }

    @RequestMapping("/remoKey")
    public void remoKey() {
        cacheManager.getCache("baseCache").clear();
    }

    @RequestMapping("/getKey")
    public Test getKey() {
        Cache cache = cacheManager.getCache("baseCache");
        return (Test) cache.get("123").get();
    }
}
