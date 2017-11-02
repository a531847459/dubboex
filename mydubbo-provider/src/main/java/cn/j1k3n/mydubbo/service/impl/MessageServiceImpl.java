package cn.j1k3n.mydubbo.service.impl;

import org.springframework.stereotype.Service;

import cn.j1k3n.mydubbo.service.IMessageService;
@Service
public class MessageServiceImpl implements IMessageService {

	@Override
	public String echo(String str) {
		return "【echo】:"+str;
	}

}
