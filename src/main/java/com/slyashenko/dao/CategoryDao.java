package com.slyashenko.dao;

import com.slyashenko.model.Category;

/**
 * Created by Kate on 29.04.17.
 */
public interface CategoryDao extends GenericDao<Category>{

    Category getCategoryWithProductsById(Long id);
}
