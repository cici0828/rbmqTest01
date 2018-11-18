package com.fengwei.rbmqTest01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RbmqTest01ApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
    private HelloSender helloSender;
	
	@Test
    public void testRabbit() {
        helloSender.send();
    }
	
	@Test
    public void testRabbit2() {
        helloSender.send2();
    }
	
	@Test
	public void testRabbitTopic2() {
		helloSender.sendTopic1();
	}
	
	@Test
	public void testRabbitFanout() {
		helloSender.sendFanout();
	}

}
