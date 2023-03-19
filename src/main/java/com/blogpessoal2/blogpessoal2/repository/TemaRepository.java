package com.blogpessoal2.blogpessoal2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blogpessoal2.blogpessoal2.model.Tema;

@Repository
	public interface TemaRepository extends JpaRepository<Tema, Long> {
	   
	 public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

	}

