package com.br.caronas.dao;

import org.junit.Test;

import com.br.caronas.domain.Carro;
import com.br.caronas.domain.Motorista;
import com.br.caronas.domain.Pessoa;

public class MotoristaDAOTest {
	@Test
	public void salvar(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(1L);
		
		CarroDAO carroDAO = new CarroDAO();
		Carro carro = carroDAO.buscar(1L);
		
		Motorista motorista = new Motorista();
		motorista.setPessoa(pessoa);
		motorista.setCarro(carro);
		
		MotoristasDAO motoristasDAO = new MotoristasDAO();
		motoristasDAO.salvar(motorista);
		
	}
}
