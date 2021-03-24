package com.javaapp.project.hibernateAndJpa.DataAccess;
import java.util.List;

import com.javaapp.project.hibernateAndJpa.Entities.*;

public interface ICityDal {
	List<City> GetAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);

}
