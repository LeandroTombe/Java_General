package com.proyecto.leandro.repository;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.leandro.entity.Anime;

/**
 * 
 * @author leandro
 * @version 12/10/2021
 * Interface que contiene el CRUD con Spring JPA para la tabla de anime
 */


public interface AnimesRepository extends CrudRepository<Anime, Long> {

}
