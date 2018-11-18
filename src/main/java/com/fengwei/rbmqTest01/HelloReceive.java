package com.fengwei.rbmqTest01;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fengwei.rbmqTest01.po.User;

/**
 * @author 冯蔚
 * 日期：2018年11月17日 下午9:37:01
 * 
 */
@Component
public class HelloReceive {
	
//	@RabbitListener(queues="queue")
//	public void processC(String str) {
//        System.out.println("Receive:"+str);
//    }
	
	@RabbitListener(queues="queue")
	public void process1(User user) {
		System.out.println(user);
	}
	
	@RabbitListener(queues="topic.message")
	public void process2(User user) {
		System.out.println("message:" + user);
	}
	
	@RabbitListener(queues="topic.messages")
	public void process3(User user) {
		System.out.println("messages:" + user);
	}
	
	@RabbitListener(queues="fanout.A")
    public void processA(String str1) {
		System.out.println("--------------------------------------------");
        System.out.println("ReceiveA:"+str1);
    }
    @RabbitListener(queues="fanout.B")
    public void processB(String str) {
        System.out.println("ReceiveB:"+str);
    }
    @RabbitListener(queues="fanout.C")
    public void processC(String str) {
        System.out.println("ReceiveC:"+str);
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

}
