package com.br.caronas.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.br.caronas.util.HibernateUtil;

public class HibernateContexto implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		HibernateUtil.getFabricaDeSessoesDeSessoes().close();
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		HibernateUtil.getFabricaDeSessoesDeSessoes();
	}

}