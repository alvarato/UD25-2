package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacoteck.springboot.app.dto.Departamento;
import com.pacoteck.springboot.app.service.DepartamentoServiceImp;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Departamento> findAll(){
		return imp.listAll();
	}
	
	@DeleteMapping("/delete{id}")
	public void delteById(@PathVariable("id") int id) {
		imp.deleteById(id);
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Departamento entity) {
		imp.create(entity);
	}

	@PostMapping("update")
	public void update(@RequestBody Departamento entity) {
		imp.update(entity);
	}
}
