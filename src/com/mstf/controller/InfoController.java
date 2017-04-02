package com.mstf.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.annotations.Parameter;
import org.jboss.logging.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mstf.bean.Info;
import com.mstf.service.InfoService;

@Controller
@RequestMapping("/infoController")
public class InfoController {
	@Resource
	private  InfoService infoService ;
	@RequestMapping("/list")
	public String list(ModelMap model) throws Exception {
		List<Info> infoList = infoService.getAll() ;
//		HttpServletRequest request
//		request.setAttribute("infoList", infoList) ;
		
		model.addAttribute("infoList", infoList) ;
		return "WEB-INF/jsp/list";
	}
	@RequestMapping("/addUI")
	public String addUI() throws Exception {
		
		return "WEB-INF/jsp/addUI" ;
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(Info info) throws Exception {
	     infoService.save(info) ;
		return "redirect:list.do" ;
	}
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String edit(Info info) throws Exception {
		Info infos = infoService.getById(info.getId());
//		infos.set一般的属性
//		infos.set关联属性
		infos.setName(info.getName()) ;
		infos.setBirthday(info.getBirthday()) ;
		
		infoService.update(infos) ;
		return "redirect:list.do" ;
	}
	@RequestMapping("/editUI")
	public String editUI(Long id,ModelMap model) throws Exception {
		Info info = infoService.getById(id);
		model.addAttribute("info", info) ;
		return "WEB-INF/jsp/editUI";
	}
	@RequestMapping("/delete")
	public String delete(Long id) throws Exception {
		infoService.delete(id);
		return "redirect:list.do" ;
	}
}
