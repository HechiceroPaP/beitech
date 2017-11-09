package com.beitech.common.dao.impl;

import java.util.List;
import java.util.ResourceBundle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.beitech.common.dao.OrdersDao;
import com.beitech.common.entities.Orders;

@Repository
public class OrdersDaoImpl implements OrdersDao {

	@PersistenceContext(unitName = "facturacionJPA")
	private EntityManager entityManager;

	private ResourceBundle sqlBundle = ResourceBundle.getBundle(OrdersDaoImpl.class.getSimpleName());

	@Override
	public List<Orders> listarOrdenes() {
		StringBuilder sql = new StringBuilder();
		sql.append(sqlBundle.getString("listarOrdenes"));
		
		System.out.println("sql.toString(): ");
		System.out.println(sql.toString());
		
		Query query = entityManager.createNativeQuery(sql.toString(), Orders.class);
		
		System.out.println(query);
		
		return query.getResultList();
	}

}
