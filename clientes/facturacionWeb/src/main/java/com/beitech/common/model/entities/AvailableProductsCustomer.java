package com.beitech.common.entities;

import java.io.Serializable;

public class AvailableProductsCustomer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long orderId;
	private Long customerId;
	private Long deliveryAddress;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Long deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
}
