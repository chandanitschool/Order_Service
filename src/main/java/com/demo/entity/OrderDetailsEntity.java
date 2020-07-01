package com.demo.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_DETAILS")
public class OrderDetailsEntity {
	@Id
	@Column(name="CUST_NAME")
	private String customerName;
	
	@Column(name="ORDR_DATE")
	private String orderDate;
	@Column(name="ADDRSS")
	private String shipping_address;
	@Column(name="PROD_NAME")
	private String productName;
	
	@Column(name="PROD_CODE")
	private Integer productCode;
	

	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShipping_address() {
		return shipping_address;
	}

	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}

	

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	

	
	
	

}
