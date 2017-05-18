package com.br.caronas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain{
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 3, nullable = false)
	private String idade;
	
	@Column(length = 15, nullable = false)
	private String cpf;
	
	@Column(length = 14, nullable = false)
	private String celular;
	
	@Column(length = 100, nullable = false)
	private String email;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
