package com.blogpessoal2.blogpessoal2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal2.blogpessoal2.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

	public Optional<Usuario> findByUsuario (String usuario);
	
	
}
