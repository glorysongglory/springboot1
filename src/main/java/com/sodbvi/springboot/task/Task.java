package com.sodbvi.springboot.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {

    @Scheduled(cron = "0/5 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task running++++++");
    }
}
