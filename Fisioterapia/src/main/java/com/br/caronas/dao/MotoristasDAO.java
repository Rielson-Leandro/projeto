package com.br.caronas.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.br.caronas.domain.Motorista;
import com.br.caronas.domain.Passageiro;
import com.br.caronas.util.HibernateUtil;

public class MotoristasDAO extends GenericDAO<Motorista> {
	public List<Passageiro> listaProPassageiro(long passageiroCodigo) {
		Session sessao = HibernateUtil.getFabricaDeSessoesDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Passageiro.class);
			consulta.add(Restrictions.eq("motorista.codigo", passageiroCodigo));
			consulta.addOrder(Order.asc("nome"));
			List<Passageiro> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
}
