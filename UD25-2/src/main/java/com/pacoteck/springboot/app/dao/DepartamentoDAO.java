package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Departamento;

public interface DepartamentoDAO extends JpaRepository<Departamento, Integer>{

}
