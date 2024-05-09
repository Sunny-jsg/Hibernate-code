package com.ait.dao;

import com.ait.entity.ProductEntity;

public interface ProductDAO {
	ProductEntity  saveproduct(ProductEntity  product);
    ProductEntity   loadProductById(Integer Product_Id);
    ProductEntity updateproductById(Integer product_id, double new_UnitPrice);
    void deleteproductById(Integer Product_Id);
}
