package com.slyashenko.service;

import com.slyashenko.model.Product;

/**
 * Created by Kate on 01.05.17.
 */
public interface ProductService {

    Product getProductById(Long id);
    Product getProductWithCategoryById(Long id);

    Product addProduct(Product product);
}
