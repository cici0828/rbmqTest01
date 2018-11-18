package com.fengwei.rbmqTest01;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 冯蔚 日期：2018年11月18日 下午4:56:37
 * 
 */
@Configuration
public class SenderConfFanout {

	@Bean(name = "AMessage")
	public Queue AMessage() {
		return new Queue("fanout.A");
	}

	@Bean(name = "BMessage")
	public Queue BMessage() {
		return new Queue("fanout.B");
	}

	@Bean(name = "CMessage")
	public Queue CMessage() {
		return new Queue("fanout.C");
	}

	 @Bean
	 FanoutExchange fanoutExchange() {
	 return new FanoutExchange("fanoutExchange");//配置广播路由器
	 }
	
	 @Bean
	 Binding bindingExchangeA(@Qualifier("AMessage") Queue AMessage,FanoutExchange
	 fanoutExchange) {
	 return BindingBuilder.bind(AMessage).to(fanoutExchange);
	 }
	
	 @Bean
	 Binding bindingExchangeB(@Qualifier("BMessage") Queue BMessage,
	 FanoutExchange fanoutExchange) {
	 return BindingBuilder.bind(BMessage).to(fanoutExchange);
	 }
	
	 @Bean
	 Binding bindingExchangeC(@Qualifier("CMessage") Queue CMessage,
	 FanoutExchange fanoutExchange) {
	 return BindingBuilder.bind(CMessage).to(fanoutExchange);
	 }

}
