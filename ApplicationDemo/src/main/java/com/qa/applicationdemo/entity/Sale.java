package com.qa.applicationdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Tesco")

public class Sale {
	
	@Id
	@GeneratedValue
	//@Column(unique=true)
	@Column(name="sales_id")
	private int salesId;   // 1
	@Column(name="product_id")
	private int productId;  //101
	@Column(length=50, name="product_name")
	private String productName; //coke
	@Column(columnDefinition="char(40)")
	private String description;
	private int quantity;  //12
	private float price;  //2.0
	
	@Transient // this amount is not calculated in mysql
	private float amount;  // 24.0
	@Transient
	private float tax;  // 1.5
	@Transient
	private float netAmount;  // 25.50
	
	
	
	

}
