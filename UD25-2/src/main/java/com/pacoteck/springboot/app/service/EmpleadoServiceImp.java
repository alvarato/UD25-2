package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.EmpleadoDAO;
import com.pacoteck.springboot.app.dto.Empleado;

@Service
public class EmpleadoServiceImp implements IEmpleadoService{

	@Autowired
	EmpleadoDAO dao;

	@Override
	public void create(Empleado entity) {
		dao.save(entity);
		
	}

	@Override
	public List<Empleado> findAll() {
		return dao.findAll();
	}

	@Override
	public void update(Empleado entity) {
		List<Empleado> aux = dao.findAll();
		for (Empleado empleado : aux) {
			if(empleado.getDni().equals(entity.getDni())) {
				dao.save(entity);
			}
		}
		
	}

	@Override
	public void deleteById(String id) {
		dao.deleteById(id);
		
	}
	
	
}
