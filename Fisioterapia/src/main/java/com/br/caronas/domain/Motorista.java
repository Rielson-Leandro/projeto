package com.br.caronas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Motorista extends GenericDomain{
	
	@Column(length = 50, nullable = false)
	private String origem;
	
	@Column(length = 50, nullable = false)
	private String destino;
	
	@Column(length = 7, nullable = false)
	private int numeroVagas;
	
	@Column(length = 5, nullable = false)
	private String horaSaida;
	
	@Column(length = 50, nullable = false)
	private String localSaida;
	
	@Column(length = 50, nullable = false)
	private String localChegada;
	
	@Column(length = 50, nullable = false)
	private double valorContribuicao;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Carro carro;
	
	
	

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getNumeroVagas() {
		return numeroVagas;
	}

	public void setNumeroVagas(int numeroVagas) {
		this.numeroVagas = numeroVagas;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String getLocalSaida() {
		return localSaida;
	}

	public void setLocalSaida(String localSaida) {
		this.localSaida = localSaida;
	}

	public String getLocalChegada() {
		return localChegada;
	}

	public void setLocalChegada(String localChegada) {
		this.localChegada = localChegada;
	}

	public double getValorContribuicao() {
		return valorContribuicao;
	}

	public void setValorContribuicao(double valorContribuicao) {
		this.valorContribuicao = valorContribuicao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
}
