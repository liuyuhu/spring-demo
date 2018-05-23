package com.github.timetask.timetask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuyuhu
 * @date 2018/5/23 下午3:46
 */

@Component
public class TestTask {

    @Scheduled(cron = "0 1 * * * ?")
    public void test() {
        System.out.println("============ 定时任务测试 " + getTime() + " ==============");
    }

    /**
     * 上一次启动时间点之后每多少毫秒执行一次
     */
    @Scheduled(fixedRate = 5000)
    public void fixedRate() {
        System.out.println("============ fixedRate测试\t " + getTime() + " ==============");
    }


    /**
     * 上一次结束时间点之后每多少毫秒执行一次
     */
    @Scheduled(fixedDelay = 50000)
    public void fixedDelay() {
        System.out.println("============ fixedDelay测试\t " + getTime() + " ==============");
    }

    /**
     * 第一次延迟多少毫秒执行，之后按照fixedRate的规则每多少毫秒执行
     */
    @Scheduled(initialDelay = 50000, fixedRate = 20000)
    public void initialDelay() {
        System.out.println("============ initialDelay测试\t " + getTime() + " ==============");
    }

    private String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }


}
