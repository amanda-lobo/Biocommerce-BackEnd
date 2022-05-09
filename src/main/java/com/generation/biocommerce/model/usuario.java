package com.generation.biocommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome é obrigatório, e não pode conter espaços em branco :)")
	@Size(min = 10, max = 50, message = "O atributo nome deve conter no minímo 10 e máximo 50 caracteres")
	private String nome;

	@NotBlank(message = "O atributo usuario é obrigatório, e não pode conter espaços em branco :)")
	@Size(min = 10, max = 20, message = "O atributo usuario deve conter no minímo 10 máximo 20 caracteres")
	private String usuario;

	@NotNull
	@Size(min = 8, message = "O atributo senha deve conter no mínimo 8 caracteres")
	private int senha;

	@NotNull
	private String foto;

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

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
