package com.blogpessoal.blogpessoal.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Especifica que a classe é uma entidade
@Table (name = "tb_postagens") //Nome para minha tabela
public class Postagem {
	
	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Vai se autocompletar (Auto_increment)
	private long id;
	
	@NotBlank
	@Size(min = 3, max = 255)
	private String titulo;
	
	@NotBlank
	@Size(min = 3, max = 1000)
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime date;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema; //O primeiro é a referência, o segundo é a variável. O segundo eu posso alterar para o que quiser.
	
	
	private String foto;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public Tema getTema() {
		return tema;
	}


	public void setTema(Tema tema) {
		this.tema = tema;
	}
	

	
	
}
