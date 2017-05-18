package com.br.caronas.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.br.caronas.dao.PessoaDAO;
import com.br.caronas.domain.Pessoa;
import com.google.gson.Gson;

@Path("pessoa")
public class PessoaService {
	@GET
	public String listar(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> pessoas = pessoaDAO.listar("nome");
		
		Gson gson = new Gson();
		String json = gson.toJson(pessoas);
		
		return json;
	}
	
	@GET
	@Path("{codigo}")
	public String buscar(@PathParam("codigo") long codigo){
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		
		Gson gson = new Gson();
		String json = gson.toJson(pessoa);
		
		return json;
	}
	
	@POST
	public String salvar(String json){
		Gson gson = new Gson();
		Pessoa pessoa = gson.fromJson(json, Pessoa.class);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
		
		String jsonSaida = gson.toJson(pessoa);
		
		return jsonSaida;
	}
	
	@DELETE
	public String excluir(String json){
		Gson gson = new Gson();
		Pessoa pessoa = gson.fromJson(json, Pessoa.class);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoa = pessoaDAO.buscar(pessoa.getCodigo());
		pessoaDAO.excluir(pessoa);
		
		String jsonSaida = gson.toJson(pessoa);
		
		return jsonSaida;
	}
}
