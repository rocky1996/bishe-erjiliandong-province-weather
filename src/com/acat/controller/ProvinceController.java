package com.acat.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acat.pojo.City;
import com.acat.pojo.Province;
import com.acat.service.ProvinceService;

@Controller
@RequestMapping("/province")
public class ProvinceController {
	
	@Autowired
	private ProvinceService ps;
	
	@RequestMapping("/getProvinceId")
	@ResponseBody
	public List<City> getProvinceId(@RequestBody String name){
		System.out.println(name);
		int id = ps.findProvinceId(name);
		System.out.println("id是="+id);
		List<City> cities = ps.findCityByProvince(id);
		System.out.println("大小为="+cities.size());
		System.out.println(cities);
		return cities;
	}
	
	@RequestMapping("/getAllProvinces")
	@ResponseBody
	public List<Province> getAllProvinces(){
		List<Province> list = ps.findAll();
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("/getData")
	@ResponseBody
	public String getData(@RequestBody String city){
		System.out.println(city);
		return "dehfry";
	}
}
