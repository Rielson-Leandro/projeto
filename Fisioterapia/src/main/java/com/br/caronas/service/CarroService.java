package com.br.caronas.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.br.caronas.dao.CarroDAO;
import com.br.caronas.domain.Carro;
import com.google.gson.Gson;

@Path("carro")
public class CarroService {
	
	@POST
	public String salvar(String json){
		Gson gson = new Gson();
		Carro carro = gson.fromJson(json, Carro.class);
		
		CarroDAO carroDAO = new CarroDAO();
		carroDAO.salvar(carro);
		
		String jsonSaida = gson.toJson(carro);
		
		return jsonSaida;
	}
	
	@GET
	public String Listar(){
		CarroDAO carroDAO = new CarroDAO();
		List<Carro> carros = carroDAO.listar("nome");
		
		Gson gson = new Gson();
		String json = gson.toJson(carros);
		
		return json;
	}
	
	@GET
	@Path("{codigo}")
	public String buscar(@PathParam("codigo") long codigo){
		CarroDAO carroDAO = new CarroDAO();
		Carro carro = carroDAO.buscar(codigo);
		
		Gson gson = new Gson();
		String json = gson.toJson(carro);
		
		return json;
	}
	
	@PUT
	public String editar(String json){
		Gson gson = new Gson();
		Carro carro = gson.fromJson(json, Carro.class);
		
		CarroDAO carroDAO = new CarroDAO();
		carroDAO.editar(carro);
		
		String jsonSaida = gson.toJson(carro);
		
		return jsonSaida;
	}
	
	@DELETE
	public String excluir(String json){
		Gson gson = new Gson();
		Carro carro = gson.fromJson(json, Carro.class);
		
		CarroDAO carroDAO = new CarroDAO();
		carro = carroDAO.buscar(carro.getCodigo());
		carroDAO.excluir(carro);
		
		String jsonSaida = gson.toJson(carro);
		
		return jsonSaida;
	}
}
