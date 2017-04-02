package com.mstf.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mstf.bean.Info;
import com.mstf.bean.Zuyuan;
import com.mstf.service.ZuyuanService;

@Controller
@RequestMapping("/zuyuanController")
public class ZuyuanController {
	@Resource
	private  ZuyuanService zuyuanService ;
	private Long zuzhangid1;
	@RequestMapping("/list")
	public String list(ModelMap model,Long zuzhangid) throws Exception {
		System.out.println(zuzhangid);
		Info info=(Info) zuyuanService.getzuzhang(zuzhangid);
		this.zuzhangid1=zuzhangid;
		model.addAttribute("info", info) ;
		return "WEB-INF/jsp1/list";
	}
	@RequestMapping("/addUI")
	public String addUI(ModelMap model) throws Exception {
		System.out.println(zuzhangid1);
		model.addAttribute("zuzhangid1",zuzhangid1);
		return "WEB-INF/jsp1/addUI" ;
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(Zuyuan zuyuan,Long zuzhangid) throws Exception {
		System.out.println(zuyuan.getName());
		Info info=(Info) zuyuanService.getzuzhang(zuzhangid);
		zuyuan.setInfo(info);
		zuyuanService.save(zuyuan) ;
		return "redirect:/zuyuanController/list.do?zuzhangid="+zuzhangid ;
	}
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String edit(Zuyuan zuyuan) throws Exception {
		Zuyuan zuyuan1 = zuyuanService.getById(zuyuan.getId());
//		infos.set一般的属性
		System.out.println(zuyuan1.getInfo().getId());
		zuyuan1.setInfo(zuyuan1.getInfo());
//		infos.set关联属性
		zuyuan1.setName(zuyuan.getName()) ;
		zuyuan1.setId(zuyuan.getId());
		zuyuan1.setBirthday(zuyuan.getBirthday()) ;
		zuyuanService.update(zuyuan1) ;
		return "redirect:/zuyuanController/list.do?zuzhangid="+zuyuan1.getInfo().getId() ;
	}
	@RequestMapping("/editUI")
	public String editUI(Long id,ModelMap model) throws Exception {
		Zuyuan zuyuan = zuyuanService.getById(id);
		model.addAttribute("info", zuyuan) ;
		return "WEB-INF/jsp1/editUI";
	}
	@RequestMapping("/delete")
	public String delete(Long id) throws Exception {
		Zuyuan zuyuan = zuyuanService.getById(id);
		zuyuanService.delete(id);
		return "redirect:/zuyuanController/list.do?zuzhangid="+zuyuan.getInfo().getId() ;
	}
	public Long getZuzhangid1() {
		return zuzhangid1;
	}
	public void setZuzhangid1(Long zuzhangid1) {
		this.zuzhangid1 = zuzhangid1;
	}
	
}
