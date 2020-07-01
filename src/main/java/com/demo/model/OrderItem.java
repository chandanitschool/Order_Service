package com.demo.model;

import java.io.Serializable;

public class OrderItem  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer productCode;
	
	private String productName;
	
	private Integer quantity;

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
}