package com.blogpessoal.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blogpessoal.model.Usuario;

import java.util.Optional;

@Repository
public interface usuarioRepository extends JpaRepository <Usuario, Long>{
	
	public Optional<Usuario> findByUsuario (String usuario);

}
