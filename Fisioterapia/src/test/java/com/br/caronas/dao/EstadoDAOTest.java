package com.br.caronas.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.br.caronas.domain.Estado;

public class EstadoDAOTest {
	@Test
	//@Ignore
	public void salvar(){
		Estado estado = new Estado();
		estado.setNome("Pernambuco");
		estado.setSigla("PE");
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
	}
	
	@Test
	@Ignore
	public void listar(){
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();
		
		for(Estado estado : resultado){
			System.out.println(estado.getCodigo() + " - " + estado.getNome() + " - " + estado.getSigla());
		}
	}
	
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 1L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if(estado == null){
			System.out.println("Nenhum Registro encontrado ");
		}else{
			System.out.println("Registro Encontrado \n");
			System.out.println(estado.getCodigo() + " - " + estado.getNome() + " - " + estado.getSigla());
		}
	}
	
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 1L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if(estado == null){
			System.out.println("Nenhum Registro encontrado ");
		}else{
			estadoDAO.excluir(estado);
			System.out.println("Registro Encontrado \n");
			System.out.println(estado.getCodigo() + " - " + estado.getNome() + " - " + estado.getSigla());
		}
	}
	
	@Test
	@Ignore
	public void editar(){
		Long codigo = 1L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if(estado == null){
			System.out.println("Nenhum Registro encontrado ");
		}else{
			estado.setNome("São Paulo");
			estado.setSigla("SP");
			estadoDAO.excluir(estado);
			System.out.println("Registro Encontrado \n");
			System.out.println(estado.getCodigo() + " - " + estado.getNome() + " - " + estado.getSigla());
		}
	}
	
}
