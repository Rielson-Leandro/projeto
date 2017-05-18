package com.br.caronas.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.br.caronas.dao.MotoristasDAO;
import com.br.caronas.dao.PassageiroDAO;
import com.br.caronas.domain.Motorista;
import com.br.caronas.domain.Passageiro;
import com.google.gson.Gson;

@Path("passageiro")
public class PassageiroService {
	@GET
	public String listar(){
		//PassageiroDAO passageiroDAO = new PassageiroDAO();
		MotoristasDAO motoristasDAO = new MotoristasDAO();
		List<Motorista> passageiros = motoristasDAO.listar();
		
		Gson gson = new Gson();
		String json = gson.toJson(passageiros);
		
		return json;
	}
	
	@POST
	public String salvar(String json){
		Gson gson = new Gson();
		Passageiro passageiro = gson.fromJson(json, Passageiro.class);
		
		PassageiroDAO passageiroDAO = new PassageiroDAO();
		passageiroDAO.salvar(passageiro);
		
		String jsonSaida = gson.toJson(passageiro);
		
		return jsonSaida;
	}
}
