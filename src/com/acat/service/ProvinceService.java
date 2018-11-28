package com.acat.service;

import java.util.List;

import com.acat.pojo.City;
import com.acat.pojo.Province;

public interface ProvinceService {
	int findProvinceId(String province);
	List<City> findCityByProvince(int id);
	List<Province> findAll();
}
