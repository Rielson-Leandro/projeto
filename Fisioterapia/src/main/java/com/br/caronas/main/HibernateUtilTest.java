package com.br.caronas.main;

import org.hibernate.Session;

import com.br.caronas.util.HibernateUtil;

public class HibernateUtilTest {
	public static void main(String[]args){
		Session sessao = HibernateUtil.getFabricaDeSessoesDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoesDeSessoes().close();
	}

}
