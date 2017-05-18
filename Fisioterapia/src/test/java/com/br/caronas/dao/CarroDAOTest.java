package com.br.caronas.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.br.caronas.domain.Carro;

public class CarroDAOTest {
	@Test
	@Ignore
	public void salvar(){
		Carro carro = new Carro();
		carro.setNome("Baleia");
		carro.setMarca("Fiat");
		carro.setCor("Preto");
		carro.setPlaca("ccc-1234");
		carro.setModelo("Fiat Uno");
		
		CarroDAO carroDAO = new CarroDAO();
		carroDAO.salvar(carro);
		
	}
	
	@Test
	@Ignore
	public void listar(){
		CarroDAO carroDAO = new CarroDAO();
		List<Carro> resultado = carroDAO.listar();
		
		for(Carro carro : resultado){
			System.out.println(carro.getCodigo() + " - " + carro.getModelo() + " - " + carro.getCor() + " - " + carro.getPlaca() + " - " + carro.getNome());
			
		}
	}
	
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 1L;
		
		CarroDAO carroDAO = new CarroDAO();
		Carro carro = carroDAO.buscar(codigo);
		
		if(carro == null){
			System.out.println("Nunhum registro encontrado ");
		}else{
			System.out.println("registro encontrado\n ");
			System.out.println(carro.getCodigo() + " - " + carro.getModelo() + " - " + carro.getCor() + " - " + carro.getPlaca() + " - " + carro.getNome());

		}
	}
	
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 2L;
		
		CarroDAO carroDAO = new CarroDAO();
		Carro carro = carroDAO.buscar(codigo);
		
		if(carro == null){
			System.out.println("Nunhum registro encontrado ");

		}else{
			carroDAO.excluir(carro);
			System.out.println("registro removido\n ");
			System.out.println(carro.getCodigo() + " - " + carro.getModelo() + " - " + carro.getCor() + " - " + carro.getPlaca() + " - " + carro.getNome());

		}			
	}
	
	@Test
	@Ignore
	public void editar(){
		Long codigo = 1L;
		
		CarroDAO carroDAO = new CarroDAO();
		Carro carro = carroDAO.buscar(codigo);
		
		if(carro == null){
			System.out.println("Nunhum registro encontrado ");

		}else{
			carro.setModelo("Fiat Uno");
			carro.setCor("Preta");
			carro.setPlaca("aaa-1234");
			carro.setNome("Baleia");
			carro.setMarca("Fiat");
			carroDAO.editar(carro);
			System.out.println("registro Editado\n ");
			System.out.println(carro.getCodigo() + " - " + carro.getModelo() + " - " + carro.getCor() + " - " + carro.getPlaca() + " - " + carro.getNome());

		}
	}
	
}
