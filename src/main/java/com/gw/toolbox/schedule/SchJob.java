package com.gw.toolbox.schedule;

import java.util.Date;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.gw.toolbox.heartbeat.Heart;

@Component
@Configurable
@EnableScheduling
public class SchJob {
    
	//每分钟执行
    @Scheduled(fixedRate = 1000 * 60)
    public void threadJob1(){
		Date now = new Date();
    	int hour = now.getHours();
    	int minute = now.getMinutes();
    	
    	if(minute % 20 == 0) {
    		try {
        		Heart heart = new Heart();
    			heart.demoHtmlUnit("https://digitsquarehk.herokuapp.com/heart/beat");
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}
    	
    	
    }
}
