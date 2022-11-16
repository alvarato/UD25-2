package com.pacoteck.springboot.app.dto;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="departamentos")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="presupuesto")
	private int presupuesto;
	
	@OneToMany(mappedBy="departamento", cascade = CascadeType.ALL)
	private List<Empleado> empleado;

	public Departamento() {}
	
	public Departamento(int codigo, String nombre, int presupuesto, List<Empleado> empleado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.empleado = empleado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@JsonIgnore
	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	
}
