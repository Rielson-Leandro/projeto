package com.fisioFinal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

@SuppressWarnings("serial")
@Entity
public class FiltroTratamento extends GenericDomain{
	
	@Column(length = 100, nullable = false)
	private String diagnostigo;
	
	@Column(length = 50, nullable = false)
	private String tempoLesao;
	
	@Column(length = 50, nullable = false)
	private String link;
	
	//@Lob
	@Column(columnDefinition="TEXT", nullable=false)
	private String referencia;
	
	@Column(length = 50, nullable = false)
	private String anoPublicacao;
	
	//@Lob
	@Column(columnDefinition="TEXT", nullable=false)
	private String resumo;

	public String getDiagnostigo() {
		return diagnostigo;
	}

	public void setDiagnostigo(String diagnostigo) {
		this.diagnostigo = diagnostigo;
	}

	public String getTempoLesao() {
		return tempoLesao;
	}

	public void setTempoLesao(String tempoLesao) {
		this.tempoLesao = tempoLesao;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
}