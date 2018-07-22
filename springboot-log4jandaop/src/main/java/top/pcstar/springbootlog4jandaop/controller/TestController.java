package top.pcstar.springbootlog4jandaop.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 12:23 2018/7/22
 */
@RestController
public class TestController {
    private static Logger logger = Logger.getLogger(TestController.class);
    @RequestMapping("/testMethod")
    public String testMethod(String name){
        logger.info("---testMethod("+name+")---");
        return name;
    }
}
