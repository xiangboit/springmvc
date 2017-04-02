package com.mstf.service;

import java.util.List;

import com.mstf.bean.Info;

public interface InfoService {

	List<Info> getAll();

	void save(Info info);

	Info getById(Long id);

	void update(Info infos);

	void delete(Long id);
	
	
}
