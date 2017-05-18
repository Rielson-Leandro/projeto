package com.br.caronas.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.br.caronas.domain.Cidade;
import com.br.caronas.domain.Endereco;
import com.br.caronas.domain.Estado;

import com.br.caronas.dao.EstadoDAO;

public class EnderecoDAOTest {
	@Test
	@Ignore
	public void salvar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(1L);

		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(1L);

		Endereco endereco = new Endereco();
		endereco.setNome("Rua Lucio Jose Cordeiro");
		endereco.setBairro("São Pedro");
		endereco.setCep("55150-000");
		endereco.setCidade(cidade);
		endereco.getCidade().setEstado(estado);
		//endereco.setEstado(estado);// não consigo pegar o estado.

		EnderecoDAO enderecoDAO = new EnderecoDAO();
		enderecoDAO.salvar(endereco);
	}

	@Test
	//@Ignore
	public void listar() {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		List<Endereco> resultado = enderecoDAO.listar();

		for (Endereco endereco : resultado) {
			System.out.println("Código: " + endereco.getCodigo());
			System.out.println("Rua: " + endereco.getNome());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Cep: " + endereco.getCep());
			System.out.println("Codigo da Cidade: " + endereco.getCidade().getCodigo());
			System.out.println("Cidade: " + endereco.getCidade().getNome());
			System.out.println("Codigo do estado: " + endereco.getCidade().getEstado().getCodigo());
			System.out.println("Estado: " + endereco.getCidade().getEstado().getNome());
			System.out.println("Sigla do Estado: " + endereco.getCidade().getEstado().getSigla());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);

		System.out.println("Código: " + endereco.getCodigo());
		System.out.println("Rua: " + endereco.getNome());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cep: " + endereco.getCep());
		System.out.println("Codigo da Cidade: " + endereco.getCidade().getCodigo());
		System.out.println("Cidade: " + endereco.getCidade().getNome());
		System.out.println("Codigo do estado: " + endereco.getCidade().getEstado());
		System.out.println("Estado: " + endereco.getCidade().getEstado().getNome());
		System.out.println("Sigla do Estado: " + endereco.getCidade().getEstado().getSigla());
		System.out.println();
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigo = 1L;

		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);
		
		enderecoDAO.excluir(endereco);
		
		System.out.println("Endereco Removido");
		System.out.println("Código: " + endereco.getCodigo());
		System.out.println("Rua: " + endereco.getNome());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cep: " + endereco.getCep());
		System.out.println("Codigo da Cidade: " + endereco.getCidade().getCodigo());
		System.out.println("Cidade: " + endereco.getCidade().getNome());
		System.out.println("Codigo do estado: " + endereco.getCidade().getEstado());
		System.out.println("Estado: " + endereco.getCidade().getEstado().getNome());
		System.out.println("Sigla do Estado: " + endereco.getCidade().getEstado().getSigla());
		System.out.println();
	}
	
	@Test
	@Ignore
	public void editar(){
		Long codigoCidade = 1L;
		Long codigoEndereco = 1L;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		
		System.out.println("Código do Estado: " + cidade.getCodigo());
		System.out.println("Sigla do Estado: " + cidade.getNome());
		System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigoEndereco);
		
		System.out.println("Endereço a ser Editado");
		System.out.println("Código do Endereço: " + endereco.getCodigo());
		System.out.println("Nome da Rua: " + endereco.getNome());
		System.out.println("Nome do Bairro: " + endereco.getBairro());
		System.out.println("Cep: " + endereco.getCep());
		System.out.println("Código da Cidade: " + endereco.getCidade().getCodigo());
		System.out.println("Nome da Cidade: " + endereco.getCidade().getNome());
		System.out.println("Codigo do estado: " + endereco.getCidade().getEstado());
		System.out.println("Estado: " + endereco.getCidade().getEstado().getNome());
		System.out.println("Sigla do Estado: " + endereco.getCidade().getEstado().getSigla());
		System.out.println();
		
		endereco.setNome("Santo Antonio");
		endereco.setCidade(cidade);
		
		enderecoDAO.editar(endereco);
		
		System.out.println("Endereço Editado");
		System.out.println("Código do Endereço: " + endereco.getCodigo());
		System.out.println("Nome da Rua: " + endereco.getNome());
		System.out.println("Nome do Bairro: " + endereco.getBairro());
		System.out.println("Cep: " + endereco.getCep());
		System.out.println("Código da Cidade: " + endereco.getCidade().getCodigo());
		System.out.println("Nome da Cidade: " + endereco.getCidade().getNome());
		System.out.println("Codigo do estado: " + endereco.getCidade().getEstado());
		System.out.println("Estado: " + endereco.getCidade().getEstado().getNome());
		System.out.println("Sigla do Estado: " + endereco.getCidade().getEstado().getSigla());
		System.out.println();
		
		
		
	}

}
