package com.br.caronas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Carro extends GenericDomain{
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 50, nullable = false)
	private String marca;
	
	@Column(length = 50, nullable = false)
	private String modelo;
	
	@Column(length = 50, nullable = false)
	private String cor;
	
	@Column(length = 50, nullable = false)
	private String placa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
