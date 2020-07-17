package com.formacion.springboot.app.usuarios.models.dao;

/*
 * Curso: microservicios-con-spring-boot-y-spring-cloud
 * Autor: Andres Jose
 * Fuente: Udemy
 * 
 * Seccion 59. Creando el repositorio JPA para los usuarios
 */
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.formacion.springboot.app.usuarios.models.entity.Usuario;

@RepositoryRestResource(path="usuarios")
public interface IUsuarioDao extends PagingAndSortingRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
