package com.ait.otm.dao;

import com.ait.otm.entities.CategoryEntity;

public interface CategoryDAO {
	void saveCategory(CategoryEntity entity);
	CategoryEntity fetchCategory(Integer CategoryId);
	void removeCategory(Integer CategoryId);
    void testJPQLQuery();
}
