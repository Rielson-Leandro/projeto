package com.br.caronas.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.br.caronas.dao.MotoristasDAO;
import com.br.caronas.dao.PassageiroDAO;
import com.br.caronas.domain.Motorista;
import com.br.caronas.domain.Passageiro;
import com.google.gson.Gson;

@Path("motorista")
public class MotoristaService {
	@GET
	public String listar(){
		//MotoristasDAO motoristasDAO = new MotoristasDAO();
		PassageiroDAO passageiroDAO = new PassageiroDAO();
		List<Passageiro> motoristas = passageiroDAO.listar();
		
		Gson gson = new Gson();
		String json = gson.toJson(motoristas);
		
		return json;
	}
	
	@GET
	@Path("{codigo}")
	public String buscar(@PathParam("codigo") long codigo){
		MotoristasDAO motoristasDAO = new MotoristasDAO();
		Motorista motorista = motoristasDAO.buscar(codigo);
		
		Gson gson = new Gson();
		String json = gson.toJson(motorista);
		
		return json;
	}
	
	@POST
	public String salvar(String json){
		Gson gson = new Gson();
		Motorista motorista = gson.fromJson(json, Motorista.class);
		
		MotoristasDAO motoristasDAO = new MotoristasDAO();
		motoristasDAO.salvar(motorista);
		
		String jsonSaida = gson.toJson(motorista);
		
		return jsonSaida;
	}
	
	@PUT
	public String editar(String json){
		Gson gson = new Gson();
		Motorista motorista = gson.fromJson(json, Motorista.class);
		
		MotoristasDAO motoristasDAO = new MotoristasDAO();
		motoristasDAO.editar(motorista);
		
		String jsonSaida = gson.toJson(motorista);
		
		return jsonSaida;
	}
	
	@DELETE
	public String excluir(String json){
		Gson gson = new Gson();
		Motorista motorista = gson.fromJson(json, Motorista.class);
		
		MotoristasDAO motoristasDAO = new MotoristasDAO();
		motorista = motoristasDAO.buscar(motorista.getCodigo());
		motoristasDAO.excluir(motorista);
		
		String jsonSaida = gson.toJson(motorista);
		
		return jsonSaida;
		
	}
}
