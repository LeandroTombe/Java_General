/**
 * 
 */
package com.proyecto.leandro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.leandro.entity.Anime;
import com.proyecto.leandro.service.AnimesService;

/**
 *@author leandro
 * @version 12/10/2021
 * controlador que manipula el flujo de los servicios rest del microservicio de animes.
 */


@RestController
@RequestMapping("/animes")
public class AnimesController {
	
	@Autowired
	private AnimesService AnimesServiceImpl;
	
	
	@GetMapping
	@RequestMapping(value="consultarAnimes", method = RequestMethod.GET)
	public ResponseEntity<?> consultarAnimes() {
		
		List<Anime> animesConsultados= this.AnimesServiceImpl.consultarAnimes();
		
		return ResponseEntity.ok(animesConsultados);
	}
	
	@PostMapping
	@RequestMapping(value="guardarAnime", method = RequestMethod.POST)
	public ResponseEntity<?> guardaAnime(@RequestBody Anime anime) {
		
		Anime animeGuardado=this.AnimesServiceImpl.guardarAnime(anime);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(animeGuardado);
	}
	
	
	@PutMapping
	@RequestMapping(value="actualizarAnime", method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarAnime(@RequestBody Anime anime) {
		
		Anime animeActualizado=this.AnimesServiceImpl.actualizarAnime(anime);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(animeActualizado);
	}
	
	
	@DeleteMapping
	@RequestMapping(value="eliminarAnime/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarAnime(@PathVariable Long id) {
		
		this.AnimesServiceImpl.eliminarAnime(id);
		
		return ResponseEntity.ok().build();
	}
}
