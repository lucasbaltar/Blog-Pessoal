package com.blogpessoal.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.blogpessoal.blogpessoal.model.Postagem;

public interface postagemRepository extends JpaRepository <Postagem, Long> {
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}

