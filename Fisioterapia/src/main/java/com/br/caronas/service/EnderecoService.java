package com.br.caronas.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.br.caronas.dao.EnderecoDAO;
import com.br.caronas.domain.Endereco;
import com.google.gson.Gson;

@Path("endereco")
public class EnderecoService {
	@GET
	public String listar(){
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		List<Endereco> enderecos = enderecoDAO.listar("nome");
		
		
		Gson gson = new Gson();
		String json = gson.toJson(enderecos);
		
		return json;
	}
	
	@GET
	@Path("{codigo}")
	public String buscar(@PathParam("codigo") long codigo){
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);
		
		Gson gson = new Gson();
		String json = gson.toJson(endereco);
		
		return json;
		
	}
	
	@POST
	public String salvar(String json){
		Gson gson = new Gson();
		Endereco endereco = gson.fromJson(json, Endereco.class);
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		enderecoDAO.salvar(endereco);
		
		String jsonSaida = gson.toJson(endereco);
		
		return jsonSaida;
	}
	
	@PUT
	public String editar(String json){
		Gson gson = new Gson();
		Endereco endereco = gson.fromJson(json, Endereco.class);
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		enderecoDAO.editar(endereco);
		
		String jsonSaida = gson.toJson(endereco);
		
		return jsonSaida;
	}
	
	@DELETE
	public String excluir(String json){
		Gson gson = new Gson();
		Endereco endereco = gson.fromJson(json, Endereco.class);
		
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		endereco = enderecoDAO.buscar(endereco.getCodigo());
		enderecoDAO.excluir(endereco);
		
		String jsonSaida = gson.toJson(endereco);
		
		return jsonSaida;
	}
}
