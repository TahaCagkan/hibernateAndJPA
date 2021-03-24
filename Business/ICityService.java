package com.javaapp.project.hibernateAndJpa.Business;

import java.util.List;

import com.javaapp.project.hibernateAndJpa.Entities.City;

public interface ICityService {
	List<City> GetAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
