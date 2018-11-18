package com.fengwei.rbmqTest01;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author 冯蔚
 * 日期：2018年11月17日 下午9:20:38
 * 
 */
@Configuration
public class SenderConf {
	@Bean
	public Queue queue() {
		return new Queue("queue");
	}

}
