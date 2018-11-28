package com.acat.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acat.mapper.ProvinceMapper;
import com.acat.pojo.City;
import com.acat.pojo.Province;
import com.acat.service.ProvinceService;

@Service
public class ProvinceServiceImpl implements ProvinceService{

	@Autowired
	private ProvinceMapper pm;
	
	@Override
	public int findProvinceId(String province) {
		return pm.findProvinceId(province);
	}

	@Override
	public List<City> findCityByProvince(int id) {
		return pm.findCityByProvince(id);
	}

	@Override
	public List<Province> findAll() {
		return pm.findAll();
	}

}
