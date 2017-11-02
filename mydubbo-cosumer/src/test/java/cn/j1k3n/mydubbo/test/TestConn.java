package cn.j1k3n.mydubbo.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.j1k3n.mydubbo.service.IMessageService;

@ContextConfiguration(locations={"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestConn {
	public class TestDemo {
		@Resource
		private IMessageService messageService;
		@Test
		public void testEcho() {
			System.out.println(messageService.echo("zzzzzzzzz")); 
		}
	}
}
