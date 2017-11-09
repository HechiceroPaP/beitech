package com.beitech.common.service;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.beitech.common.entities.Orders;
import com.beitech.common.manager.OrdersManager;

@Component
@Path("public/orders")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class OrdersSR {
	
	@Autowired
	OrdersManager ordersManager;

	@GET
	@Path("listarOrdenes")
	public List<Orders> listarOrdenes() {
		System.out.println("Entramos en el servicio de listar ordenes.");

		List<Orders> orders = ordersManager.listarOrdenes();
		// List<Orders> orders = new ArrayList<>();

		/*Orders order = new Orders();
		order.setOrderId(1l);
		order.setCustomerId(1l);
		order.setDeliveryAddress(90l);
		orders.add(order);*/

		return orders;
	}
}
