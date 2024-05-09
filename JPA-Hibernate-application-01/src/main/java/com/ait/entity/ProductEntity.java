package com.ait.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name ="TBL_PRODUCT")
public class ProductEntity {
@Id
@Column(name = "Product_id" )
private int Productid;
@Column(name ="Product_Name")
private String ProductName;
private int quantity;
@Column(name ="Unit_Price")
private Double UnitPrice;
@Column(name ="Created_On")
@CreationTimestamp
private LocalDateTime CreatedOn;
@Column(name ="Updated_On")
@UpdateTimestamp
private LocalDateTime UpdatedOn;
public int getProductid() {
	return Productid;
}
public void setProductid(int productid) {
	Productid = productid;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Double getUnitPrice() {
	return UnitPrice;
}
public void setUnitPrice(Double unitPrice) {
	UnitPrice = unitPrice;
}
public LocalDateTime getCreatedOn() {
	return CreatedOn;
}
public void setCreatedOn(LocalDateTime createdOn) {
	CreatedOn = createdOn;
}
public LocalDateTime getUpdatedOn() {
	return UpdatedOn;
}
public void setUpdatedOn(LocalDateTime updatedOn) {
	UpdatedOn = updatedOn;
}
@Override
public String toString() {
	return "ProductEntity [Productid=" + Productid + ", ProductName=" + ProductName + ", quantity=" + quantity
			+ ", UnitPrice=" + UnitPrice + ", CreatedOn=" + CreatedOn + ", UpdatedOn=" + UpdatedOn + "]";
}

}
