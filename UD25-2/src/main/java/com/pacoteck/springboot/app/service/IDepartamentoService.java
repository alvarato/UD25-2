package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Departamento;

public interface IDepartamentoService {
	
	public void create(Departamento entity);
	
	public List<Departamento> listAll();
	
	public void update(Departamento entity);
	
	public void deleteById(int id);

}
