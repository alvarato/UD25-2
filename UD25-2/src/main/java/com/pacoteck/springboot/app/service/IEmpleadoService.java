package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Empleado;

public interface IEmpleadoService {
	
	public void create(Empleado entity);
	
	public List<Empleado> findAll();
	
	public void update(Empleado entity);
	
	public void deleteById(String id);

}
