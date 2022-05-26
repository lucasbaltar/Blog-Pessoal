package com.blogpessoal.blogpessoal.model;

public class UsuarioLogin {
	
	private Long id;
	private String nome;
	private String usuario;
	private String foto;
	private String senha;
	private String token;
	
	
	
	
	public UsuarioLogin(Long id, String nome, String usuario, String foto, String senha, String token) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.foto = foto;
		this.senha = senha;
		this.token = token;
	}
	
	
	public UsuarioLogin() {
		super();
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	

}
