package top.pcstar.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: PanChao
 * @Description: 全局捕获异常测试Controller
 * @Date: Created in 11:36 2018/7/15
 */
@RestController
public class ExceptionTestController {
    /**
     * 全局异常捕获测试
     * @return
     */
    @RequestMapping("/errorInfo")
    public String errorInfo() {
        int i = 1/0;
        return "Hello World!";
    }
}
