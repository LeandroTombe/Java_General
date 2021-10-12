/**
 * 
 */
package com.proyecto.leandro.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.leandro.entity.Anime;
import com.proyecto.leandro.repository.AnimesRepository;
import com.proyecto.leandro.service.AnimesService;

/**
 * /**
 * 
 * @author leandro
 * @version 12/10/2021
 * clase que implementa los metodos de logica de negocio de la interface de AnimesService.
 */

 


@Service
public class AnimesServiceImpl implements AnimesService {
	/**
	 * Bean Repository de spring inyectado para ejecutar el CRUD.
	 */
	 
	@Autowired
	private AnimesRepository AnimesRepository;
	 
	@Override
	public List<Anime> consultarAnimes() {
	
		List<Anime> animesDataSource= StreamSupport.stream(this.AnimesRepository.findAll().spliterator(), false).collect(Collectors.toList());
	
		return animesDataSource;
	}

	@Override
	public Anime guardarAnime(Anime anime) {
		anime.setFechaCreacion(LocalDateTime.now());
		
		
		return this.AnimesRepository.save(anime);
	}

	@Override
	public Anime actualizarAnime(Anime anime) {

		return this.AnimesRepository.save(anime);
	}

	@Override
	public void eliminarAnime(Long id) {
		this.AnimesRepository.deleteById(id);
		
	}

}
