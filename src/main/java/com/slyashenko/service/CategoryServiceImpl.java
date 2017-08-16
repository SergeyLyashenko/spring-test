package com.slyashenko.service;

import com.slyashenko.dao.CategoryDao;
import com.slyashenko.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kate on 29.04.17.
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getAllCategories() {
        return categoryDao.readAll(Category.class);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryDao.read(Category.class, id);
    }

    @Override
    public Category getCategoryWithProductsById(Long id) {
        return categoryDao.getCategoryWithProductsById(id);
    }
}
