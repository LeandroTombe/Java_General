package com.proyecto.leandro.service;

import java.util.List;

import com.proyecto.leandro.entity.Anime;

/**
 * 
 * @author leandro
 * @version 12/10/2021
 * Interface que contiene los metodos de logica de negocio para los animes.
 */


public interface AnimesService {
	
	/**
	 * 
	 * 
	 * Metodo que permite consultar el listado de animes
	 * @return listado de animes
	 */
	List<Anime> consultarAnimes();
	
	/**
	 * Metodo que permite guardar anime
	 * @param anime ({@link Anime} objeto anime a guardar.
	 * @return anime guardado
	 */
	Anime guardarAnime(Anime anime);
	
	/**
	 * Metodo que permite actualizar un  anime
	 * @param anime ({@link Anime} objeto anime a actualizar.
	 * @return anime actualizado
	 */
	Anime actualizarAnime(Anime anime);
	/**
	 * Metodo que permite eliminar un anime
	 * @param id ({@link long} objeto anime a eliminar.
	 * @return anime eliminado
	 */
	
	
	void eliminarAnime(Long id);
	
	

}
