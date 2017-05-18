package com.br.caronas.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTest {
	@Test
	public void conectar(){
		Session sessao = HibernateUtil.getFabricaDeSessoesDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoesDeSessoes().close();
	}
}
