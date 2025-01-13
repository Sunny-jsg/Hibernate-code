package com.ait.otm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_products")
public class ProductEntity {
	@Id
	@Column(name ="product_id")
	private Integer ProductId;
	@Column(name ="product_name")
	private String ProductName;
	@Lob
	@Column(name = "product_image")
	private byte[] productimage;
	public Integer getProductId() {
		return ProductId;
	}
	public void setProductId(Integer productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public byte[] getProductimage() {
		return productimage;
	}
	public void setProductimage(byte[] productimage) {
		this.productimage = productimage;
	}
	
	
	

}
