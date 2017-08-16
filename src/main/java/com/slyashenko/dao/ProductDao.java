package com.slyashenko.dao;

import com.slyashenko.model.Product;

/**
 * Created by Kate on 01.05.17.
 */
public interface ProductDao extends GenericDao<Product>{


    Product getProductWithCategoryById(Long id);

}
