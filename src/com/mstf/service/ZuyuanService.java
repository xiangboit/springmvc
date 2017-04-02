package com.mstf.service;

import java.util.List;

import com.mstf.bean.Info;
import com.mstf.bean.Zuyuan;

public interface ZuyuanService {

	Info getzuzhang(Long id);

	void save(Zuyuan zuyuan);

	Zuyuan getById(Long id);

	void update(Zuyuan zuyuan1);

	void delete(Long id);


}
