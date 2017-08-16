package com.slyashenko.service;

import com.slyashenko.model.Category;

import java.util.List;

/**
 * Created by Kate on 29.04.17.
 */
public interface CategoryService {
    List<Category> getAllCategories();

    Category getCategoryById(Long id);

    Category getCategoryWithProductsById(Long id);
}
