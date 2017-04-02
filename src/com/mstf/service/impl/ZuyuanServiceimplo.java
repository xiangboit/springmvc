package com.mstf.service.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mstf.bean.Info;
import com.mstf.bean.Zuyuan;
import com.mstf.service.ZuyuanService;

@Service
@Transactional
@SuppressWarnings("unchecked")
public class ZuyuanServiceimplo implements ZuyuanService{
	@Resource
	private SessionFactory sessionFactory ;
	
	@Override
	public void save(Zuyuan info) {
		sessionFactory.getCurrentSession().save(info) ;
	}
	@Override
	public Zuyuan getById(Long id) {
		return (Zuyuan) sessionFactory.getCurrentSession().get(Zuyuan.class, id);
	}
	@Override
	public void update(Zuyuan infos) {
		sessionFactory.getCurrentSession().update(infos);
	}
	@Override
	public void delete(Long id) {
		Object obj = sessionFactory.getCurrentSession().get(Zuyuan.class, id) ;
		sessionFactory.getCurrentSession()//
			.delete(obj) ;
		
	}
	@Override
	public Info getzuzhang(Long id) {
		return (Info) sessionFactory.getCurrentSession().get(Info.class, id);
	}

	
	
	
}
