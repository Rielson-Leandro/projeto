package com.br.caronas.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.br.caronas.domain.Endereco;
import com.br.caronas.domain.Pessoa;

public class PessoaDAOTest {
	
	@Test
	@Ignore
	public void salvar(){
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(1L);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rielson Leandro");
		pessoa.setIdade("25");
		pessoa.setEndereco(endereco);
		pessoa.setEmail("rlsl@cin.ufpe.br");
		pessoa.setCpf("101.041.234-51");
		pessoa.setCelular("997147302");
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
	}
	
	@Test
	public void listar(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();
		
		for(Pessoa pessoa : resultado){
			System.out.println("Código da Pessoa: " + pessoa.getCodigo());
			System.out.println("Nome da Pessoa: " + pessoa.getNome());
			System.out.println("Idade da Pessoa: " + pessoa.getIdade());
			System.out.println("Cpf da Pessoa: " + pessoa.getCpf());
			System.out.println("Email da Pessoa: " + pessoa.getEmail());
			System.out.println("Num Calular da Pessoa: " + pessoa.getCelular());
			System.out.println("Código Endereço: " + pessoa.getEndereco().getCodigo());
			System.out.println("Nome da Rua: " + pessoa.getEndereco().getNome());
			System.out.println("Bairro: " + pessoa.getEndereco().getBairro());
			System.out.println("Cep: " + pessoa.getEndereco().getCep());
			System.out.println("Código da Cidade: " + pessoa.getEndereco().getCidade().getCodigo());
			System.out.println("Nome da Cidade: " + pessoa.getEndereco().getCidade().getNome());
			System.out.println("Nome do Estado: " + pessoa.getEndereco().getCidade().getEstado().getNome());
			System.out.println("Sigla do Estado: " + pessoa.getEndereco().getCidade().getEstado().getSigla());
		}
	}

}
