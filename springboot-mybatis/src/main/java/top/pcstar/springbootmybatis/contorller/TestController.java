package top.pcstar.springbootmybatis.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/getTestByName")
    public Test getTestByName(String name){
        System.out.println("getTestByName");
        return testService.getTestByName(name);
    }
    @GetMapping("/addTest")
    public void addTest(String name,String sex){
        testService.addTest(name, sex);
    }
}
