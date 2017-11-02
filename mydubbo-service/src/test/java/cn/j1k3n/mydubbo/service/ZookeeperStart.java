package cn.j1k3n.mydubbo.service;

import java.util.concurrent.TimeUnit;

import com.alibaba.dubbo.container.Main;

public class ZookeeperStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.main(args);
		try {
			TimeUnit.SECONDS.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
