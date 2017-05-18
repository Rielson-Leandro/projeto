package com.br.caronas.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.br.caronas.dao.CidadeDAO;
import com.br.caronas.domain.Cidade;
import com.google.gson.Gson;

@Path("cidade")
public class CidadeService {
	@GET
	public String listar(){
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> cidades = cidadeDAO.listar("nome");
		
		Gson gson = new Gson();
		String json = gson.toJson(cidades);
		
		return json;
	}
	
	@GET
	@Path("{codigo}")
	public String buscar(@PathParam("codigo") long codigo){
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		
		Gson gson = new Gson();
		String json = gson.toJson(cidade);
		
		return json;
	}
	
	@POST
	//{"nome":"Pesqueira","estado":{"codigo":1}}
	public String salvar(String json){
		Gson gson = new Gson();
		Cidade cidade = gson.fromJson(json, Cidade.class);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
		
		String jsonSaida = gson.toJson(cidade);
		
		return jsonSaida;
	}
	
	@PUT
	//{"nome":"Pesqueira","codigo":1,"estado":{"codigo":1}}
	public String editar(String json){
		Gson gson = new Gson();
		Cidade cidade = gson.fromJson(json, Cidade.class);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.editar(cidade);
		
		String jsonSaida = gson.toJson(cidade);
		
		return jsonSaida;
	}
	
	@DELETE
	public String excluir(String json){
		Gson gson = new Gson();
		Cidade cidade = gson.fromJson(json, Cidade.class);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		cidade = cidadeDAO.buscar(cidade.getCodigo());
		cidadeDAO.excluir(cidade);
		
		String jsonSaida = gson.toJson(cidade);
		
		return jsonSaida;
	}
	
}
