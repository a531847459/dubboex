package cn.j1k3n.mydubbo.service;

import java.util.List;

import cn.j1k3n.mydubbo.vo.Dept;

public interface IDeptService {
	public boolean add(Dept vo);
	public Dept get(long deptno);
	public List<Dept> list();
}
