package cn.j1k3n.mydubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.j1k3n.mydubbo.service.IDeptService;
import cn.j1k3n.mydubbo.vo.Dept;
@Service
public class DeptServiceImpl implements IDeptService {

	@Override
	public boolean add(Dept vo) {
		System.err.println("部门增加");
		return true;
	}

	@Override
	public Dept get(long deptno) {
		Dept vo=new Dept();
		vo.setDeptno(deptno);
		vo.setDname("事业部");
		vo.setLoc("北京");
		return vo;
	}

	@Override
	public List<Dept> list() {
		List<Dept> all=new ArrayList<>();
		for(int x=0;x<10;x++) {
			Dept vo=new Dept();
			vo.setDeptno(x+1L);
			vo.setDname("事业部"+x);
			vo.setLoc("北京");
			all.add(vo);
		}
		return all;
	}

}
