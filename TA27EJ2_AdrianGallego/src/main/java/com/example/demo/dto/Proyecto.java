package com.example.demo.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="proyecto")
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_proyecto;
	
	private String nombre;
	private int horas;
	
	@OneToMany
    @JoinColumn(name="id_proyecto")
	private List<Asignado> asignado;

	public Proyecto() {
		
	}

	public Proyecto(int id_proyecto, String nombre, int horas, List<Asignado> asignado) {
		this.id_proyecto = id_proyecto;
		this.nombre = nombre;
		this.horas = horas;
		this.asignado = asignado;
	}

	public int getId_proyecto() {
		return id_proyecto;
	}

	public void setId_proyecto(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}

	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}

	
	

}
