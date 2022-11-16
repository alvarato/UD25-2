package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.DepartamentoDAO;
import com.pacoteck.springboot.app.dto.Departamento;

@Service
public class DepartamentoServiceImp implements IDepartamentoService{

	@Autowired
	DepartamentoDAO dao;

	@Override
	public void create(Departamento entity) {
		dao.save(entity);
		
	}

	@Override
	public List<Departamento> listAll() {
		return dao.findAll();
	}

	@Override
	public void update(Departamento entity) {
		List<Departamento> aux = dao.findAll();
		for (Departamento departamento : aux) {
			if(departamento.getCodigo() == entity.getCodigo()) {
				dao.save(entity);
			}
		}
		
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);	
	}
	
	
}
