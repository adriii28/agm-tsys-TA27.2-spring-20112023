package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> listarProyectos();
	
	public Proyecto listarProyectosById(Integer id);
	
	public Proyecto guardarNuevo(Proyecto p);
	
	public Proyecto actualizarNuevo(Proyecto p);
	
	public void deleteProyecto(Integer id);

}
