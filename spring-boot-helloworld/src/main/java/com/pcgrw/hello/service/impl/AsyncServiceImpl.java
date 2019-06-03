package com.pcgrw.hello.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.pcgrw.hello.service.AsyncService;

import java.util.concurrent.TimeUnit;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 20:09 2018/7/22
 */
@Service
public class AsyncServiceImpl implements AsyncService {
    @Async
    @Override
    public String asyncMethod() throws InterruptedException {
        System.out.println("asyncMethod开始");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("asyncMethod结束");
        return "success";
    }
}
