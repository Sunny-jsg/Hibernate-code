package com.ait.otm.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_categories")
public class CategoryEntity {
	@Id
	@Column(name ="category_id")
	private Integer CategoryId;
	@Column(name ="Category_name")
	private String CategoryName;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id_fk")
	private List<ProductEntity> lstOfProducts;
	public Integer getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public List<ProductEntity> getLstOfProducts() {
		return lstOfProducts;
	}
	public void setLstOfProducts(List<ProductEntity> lstOfProducts) {
		this.lstOfProducts = lstOfProducts;
	}
	
	

}
