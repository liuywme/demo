package com.example.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {
 
    private int count=0;
 
    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }

    @Scheduled(fixedRate = 6000)
    private void process2() {
        System.out.println("this is scheduler task runing  "+(count++));
    }
}