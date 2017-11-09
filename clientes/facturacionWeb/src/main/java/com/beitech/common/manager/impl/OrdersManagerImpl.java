package com.beitech.common.manager.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.beitech.common.dao.OrdersDao;
import com.beitech.common.entities.Orders;
import com.beitech.common.manager.OrdersManager;

/**
 * Implementación de la interfaz OrdersManager 
 * @author pablo.perez
 *
 */
@Service
@Primary
public class OrdersManagerImpl implements OrdersManager {

	@Autowired
	OrdersDao ordersDao;
	
	/*
	 * (non-Javadoc)
	 * @see main.java.com.manager.OrdersManager#listarOrdenes()
	 */
	@Override
	public List<Orders> listarOrdenes() {

		System.out.println("Entramos en el manager de listar ordenes.");
		
		return ordersDao.listarOrdenes();
		
		/*List<Orders> orders = new ArrayList<>();
		
		Orders order = new Orders();
		order.setOrderId(1l);
		order.setCustomerId(1l);
		order.setDeliveryAddress(90l);
		orders.add(order);
		
		return orders;*/
	}
	
}
