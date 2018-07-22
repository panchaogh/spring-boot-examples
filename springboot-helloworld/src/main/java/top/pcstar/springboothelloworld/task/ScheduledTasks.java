package top.pcstar.springboothelloworld.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: PanChao
 * @Description:
 * @Date: Created in 19:29 2018/7/22
 */
@Component
public class ScheduledTasks {
    @Scheduled(fixedRate = 5000)
    public void printCurrentTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("现在时间：" + simpleDateFormat.format(new Date()));
    }
}
