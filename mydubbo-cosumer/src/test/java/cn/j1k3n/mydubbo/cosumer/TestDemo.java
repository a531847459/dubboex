package cn.j1k3n.mydubbo.cosumer;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.j1k3n.mydubbo.service.IDeptService;
import cn.j1k3n.mydubbo.service.IMessageService;
import cn.j1k3n.mydubbo.vo.Dept;
import junit.framework.TestCase;

@ContextConfiguration(locations= {"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {
	@Resource
	private IMessageService messageService;
	@Resource
	private IDeptService deptService;
	@Test
	public void testEcho() {
		System.out.println(messageService.echo("zzzzzzzzz"));
		TestCase.assertNull(messageService.echo("zzzzzzzzz"));
	}
	@Test
	public void testDeptAdd() {
		Dept vo=new Dept();
		TestCase.assertTrue(deptService.add(vo));
	}
}
