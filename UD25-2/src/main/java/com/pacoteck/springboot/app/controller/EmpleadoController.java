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

import com.pacoteck.springboot.app.dto.Empleado;
import com.pacoteck.springboot.app.service.EmpleadoServiceImp;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Empleado> findAll(){
		return imp.findAll();
	}
	
	@DeleteMapping("/delete{id}")
	public void deleteById(@PathVariable("id") String id) {
		imp.deleteById(id);
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Empleado entity) {
		imp.create(entity);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Empleado entity) {
		imp.update(entity);
	}
}
