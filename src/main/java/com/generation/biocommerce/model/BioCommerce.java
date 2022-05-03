package com.generation.biocommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity //como se fosse o create table 
@Table(name = "tb_categoria")//dá nome para a tabela 
public class BioCommerce {
	@Id //chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)//é o auto incremento 
	private Long id;
	
	@NotBlank(message = "O atributo seção é obrigatório, e não pode conter espaços em branco!")
	@Size(min = 5, max = 50, message = "O atributo seção deve conter no mínimo 05 e no máximo 100 caracteres")
	private String secao;
	
	@NotBlank(message = "O atributo descrição é obrigatório, e não pode conter espaços em branco!")
	@Size(min = 5, max = 1000, message = "O atributo descrição deve conter no mínimo 05 e no máximo 100 caracteres")
	private String descricao;

	public Long getId() {
		return id;  
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
