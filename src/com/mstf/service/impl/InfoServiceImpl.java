package com.mstf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mstf.bean.Info;
import com.mstf.service.InfoService;

@Service
@Transactional
@SuppressWarnings("unchecked")
public class InfoServiceImpl implements InfoService{
	@Resource
	private SessionFactory sessionFactory ;
	@Override
	public List<Info> getAll() {
		return sessionFactory.getCurrentSession()//
				.createQuery("FROM Info")//
				.list();
	}
	@Override
	public void save(Info info) {
		sessionFactory.getCurrentSession().save(info) ;
	}
	@Override
	public Info getById(Long id) {
		return (Info) sessionFactory.getCurrentSession().get(Info.class, id);
	}
	@Override
	public void update(Info infos) {
		sessionFactory.getCurrentSession().update(infos);
	}
	@Override
	public void delete(Long id) {
		Object obj = sessionFactory.getCurrentSession().get(Info.class, id) ;
		sessionFactory.getCurrentSession()//
			.delete(obj) ;
		
	}
	
	
	
}
