package cn.j1k3n.mydubbo.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations="classpath:spring-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {
	@Resource
	private IMessageService messageService;
	@Test
	public void testEcho() {
//		System.out.println(messageService.echo("zzzzzzzzz"));
		System.out.println("zzzzzzzzzzzzzzzzzz");
	}
}
