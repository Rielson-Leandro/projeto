package com.br.caronas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Passageiro extends GenericDomain{
	
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
	private double valorContribuicao;
	
	@Column(nullable = false)
	private boolean mala;
	
	@Column(length = 5, nullable = false)
	private int quantidadeMala;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
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

	public double getValorContribuicao() {
		return valorContribuicao;
	}

	public void setValorContribuicao(double valorContribuicao) {
		this.valorContribuicao = valorContribuicao;
	}

	public boolean isMala() {
		return mala;
	}

	public void setMala(boolean mala) {
		this.mala = mala;
	}

	public int getQuantidadeMala() {
		return quantidadeMala;
	}

	public void setQuantidadeMala(int quantidadeMala) {
		this.quantidadeMala = quantidadeMala;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
