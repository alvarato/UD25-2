package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;import com.pacoteck.springboot.app.dto.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, String>{

}
