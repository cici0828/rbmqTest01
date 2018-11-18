package com.fengwei.rbmqTest01.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fengwei.rbmqTest01.HelloSender;

/**
 * @author 冯蔚
 * 日期：2018年11月18日 下午10:11:35
 * 
 */
@RestController()
@RequestMapping("/test")
public class TestController {
	@Autowired
    private HelloSender helloSender;
	

	public TestController() {
		System.out.println("12233");
	}
	
	@RequestMapping("/test1")
	public String testFanout() {
		helloSender.sendFanout();
		return "1";
	}
}
