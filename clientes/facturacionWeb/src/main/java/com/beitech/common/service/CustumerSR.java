package com.beitech.common.service;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.beitech.common.entities.Custumer;

@Component
@Path("public/custumer")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class CustumerSR {

	@GET
	@Path("listarClientes")
	public List<Custumer> listarClientes() {
		System.out.println("Entramos en el servicio de listar clientes.");

		List<Custumer> custumers = new ArrayList<>();

		Custumer custumer = new Custumer();
		custumer.setCustumerId(1l);
		custumer.setEmail("pablo.perez@quipux.com");
		custumer.setName("Pablo Andres Perez Melo");
		custumers.add(custumer);

		return custumers;
	}
}
