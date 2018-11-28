package com.acat.mapper;

import java.util.List;

import com.acat.pojo.City;
import com.acat.pojo.Province;

public interface ProvinceMapper extends SqlMapper{
	List<Province> findAll();
	int findProvinceId(String province);
	List<City> findCityByProvince(int id);
}
