package br.com.estudo.projeto.dto;

import org.springframework.beans.BeanUtils;

import br.com.estudo.projeto.entity.UsuarioEntity;

public class UsuarioDTO {
	
	private Long id;
	private String nome;
	private String login;
	private String email;
	private String senha;
	
	public UsuarioDTO() {
		
	}
	
	public UsuarioDTO(UsuarioEntity usuario) {
		BeanUtils.copyProperties(usuario, this);
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
