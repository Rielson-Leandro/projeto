package com.br.caronas.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class RestFullConfig extends ResourceConfig{
	public RestFullConfig(){
		packages("com.br.caronas.service");
	}
}
