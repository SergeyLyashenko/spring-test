package com.slyashenko.service;

import com.slyashenko.dao.ProductDao;
import com.slyashenko.model.Product;
import com.slyashenko.service.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    @Qualifier("productValidator")
    private Validator validator;

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public Product getProductWithCategoryById(Long id) {
        return productDao.getProductWithCategoryById(id);
    }

    @Override
    public Product addProduct(Product product) {
        validator.validate(product);
        return productDao.create(product);
    }

}
