package com.pcgrw.hello.controller;

import com.pcgrw.hello.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 20:02 2018/7/22
 */
@RestController
public class AsyncController {
    @Autowired
    private AsyncService asyncMethod;
    @RequestMapping("testAsync")
    public String testAsync(){
        System.out.println("testAsync开始");
        try {
            asyncMethod.asyncMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testAsync结束");
        return "success";
    }
}
