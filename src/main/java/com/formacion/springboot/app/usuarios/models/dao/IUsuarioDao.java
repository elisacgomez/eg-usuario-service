package com.formacion.springboot.app.usuarios.models.dao;

/*
 * Curso: microservicios-con-spring-boot-y-spring-cloud
 * Autor: Andres Jose
 * Fuente: Udemy
 * 
 * Seccion 59. Creando el repositorio JPA para los usuarios
 */
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.formacion.springboot.app.commons.usuarios.models.entity.Usuario;

@RepositoryRestResource(path="usuarios")
public interface IUsuarioDao extends PagingAndSortingRepository<Usuario, Long>{

	@RestResource(path="consultarUsuario")
	public Usuario findByUsername(@Param("nombre") String username);
}
