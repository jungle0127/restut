package com.wt.restut;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestutApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestutApplication.class, args);
		Timer timer = new Timer();  
        timer.schedule(new TimerTask() {  
            public void run() {  
                System.out.println("-------设定要指定任务--------");  
            }  
        }, 5000);// 设定指定的时间time,此处为2000毫秒  
	}
}
