package com.guide.guide2.Tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    /**
     * fixedRate: measures time from task start.
     * fixedDelay: measures time from task end.
     * cron: expression for cron job , more sophisticated task scheduling
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        log.info("The Time is now {}", dateFormat.format(new Date()));
    }
}
