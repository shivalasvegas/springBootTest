package com.qa.applicationdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="sales")

public class Sale {
	
	@Id
	@GeneratedValue
	//@Column(unique=true)
	@Column(name="sales_id")
	private int salesId;   // 1
	@Column(length=50, name="product_name")
	private String productName; //coke
	private int quantity;  //12
	private float price;  //2.0
	
	@Transient // this amount is not calculated in mysql
	private float amount;  // 24.0
	@Transient
	private float tax;  // 1.5
	@Transient
	private float netAmount;  // 25.50
	public int getSalesId() {
		return salesId;
	}
	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(float netAmount) {
		this.netAmount = netAmount;
	}
	
	
	
	

}
