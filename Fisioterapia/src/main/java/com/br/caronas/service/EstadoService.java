package com.br.caronas.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.br.caronas.dao.EstadoDAO;
import com.br.caronas.domain.Estado;
import com.google.gson.Gson;

@Path("estado")
public class EstadoService {
	@GET
	public String Listar(){
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> estados = estadoDAO.listar("nome");
		
		Gson gson = new Gson();
		String json = gson.toJson(estados);
		
		return json;
		
	}
	
	//http://localhost:8080/Caronas/rest/carona/10
	@GET
	@Path("{codigo}")
	public String buscar(@PathParam("codigo") long codigo){
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		Gson gson = new Gson();
		String json = gson.toJson(estado);
		
		return json;
	}
	
	//http://localhost:8080/Caronas/rest/carona
	//{"nome":"Pernambuco","sigla":"PE}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String salvar(String json){
		Gson gson = new Gson();
		Estado estado = gson.fromJson(json, Estado.class);
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
		
		String jsonSaida = gson.toJson(estado);
		
		return jsonSaida;
	}
	
	//http://localhost:8080/Caronas/rest/carona
	//{"nome":"Minas Gerais","sigla":"MG","codigo":3}
	@PUT
	public String editar(String json){
		Gson gson = new Gson();
		Estado estado = gson.fromJson(json, Estado.class);
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.editar(estado);
		
		String jsonSaida = gson.toJson(estado);
		
		System.out.println(jsonSaida);
		
		return jsonSaida;
	}
	
	//http://localhost:8080/Caronas/rest/carona
	//{"codigo": 8}
	@DELETE
	public String excluir(String json){
		Gson gson = new Gson();
		Estado estado = gson.fromJson(json, Estado.class);
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estado = estadoDAO.buscar(estado.getCodigo());
		estadoDAO.excluir(estado);
		
		String jsonSaida = gson.toJson(estado);
		
		return jsonSaida;
	}
}