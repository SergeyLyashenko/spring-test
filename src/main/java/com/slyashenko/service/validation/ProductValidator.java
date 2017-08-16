package com.slyashenko.service.validation;

import com.slyashenko.dao.ProductDao;
import com.slyashenko.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Kate on 06.05.17.
 */

@Component
@Qualifier("productValidator")
public class ProductValidator implements Validator<Product> {

    @Autowired
    private ProductDao productDao;

    @Override
    public void validate(final Product product) {
        List<Product> productList = productDao.readAll(Product.class);
        boolean result = productList.stream().map(Product::getName).anyMatch(s -> s.equals(product.getName()));
        if (result) {
            throw new IllegalArgumentException("Product name already exist");
        }

    }
}
