package com.slyashenko.service.validation;

import com.slyashenko.controller.CategoryController;
import com.slyashenko.dao.CategoryDao;
import com.slyashenko.model.Category;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Kate on 08.05.17.
 */
@Component
@Qualifier("categoryValidator")
public class CategoryValidator implements Validator<Category> {


    private final Logger logger = Logger.getLogger(CategoryController.class);
    private List<Category> categorytList;

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void validate(final Category category) {
        logger.debug("CategoryValidator.validate() is called.");
        categorytList = categoryDao.readAll(Category.class);
        categoryNameValidation(category);
    }

    private void categoryNameValidation(Category category){
        boolean result = categorytList.stream()
                .map(Category::getName)
                .anyMatch(s -> s.equals(category.getName()));
        if (result) {

            logger.debug("Category with name " + category.getName() + "already exist");

            throw new IllegalArgumentException("Category name already exist");
        }

    }


}
