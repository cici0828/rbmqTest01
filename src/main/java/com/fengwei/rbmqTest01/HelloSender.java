package com.fengwei.rbmqTest01;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fengwei.rbmqTest01.po.User;

/**
 * @author 冯蔚
 * 日期：2018年11月17日 下午9:25:06
 * 
 */
@Component
public class HelloSender {
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	private User createUser() {
		User user=new User();
        user.setUserName("fengwei");
        user.setUserPswd("233444");
        return user;
	}

	public void send() {
		amqpTemplate.convertAndSend("queue", "hello rabbitmq");
	}
	
	public void send2() {
        amqpTemplate.convertAndSend("queue",createUser());
	}
	
	public void sendTopic1() {
		amqpTemplate.convertAndSend("test_exchange", "topic.messages", createUser());
	}
	
	public void sendFanout() {
		amqpTemplate.convertAndSend("fanoutExchange", "", "ddddddss");
	}

}
