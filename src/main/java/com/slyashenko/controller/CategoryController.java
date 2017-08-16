package com.slyashenko.controller;

import com.slyashenko.model.Category;
import com.slyashenko.service.CategoryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by Kate on 29.04.17.
 */
@Controller
public class CategoryController {


    private final Logger logger = Logger.getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;




    @RequestMapping("/category")
    public String getCategoryById(@RequestParam(value = "id") Long id, Model model){

        logger.debug("CategoryController.getCategoryById() is called");

        Category category = categoryService.getCategoryWithProductsById(id);
        model.addAttribute("category", category);
        return "category";
    }

}
