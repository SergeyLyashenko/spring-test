package com.slyashenko.controller;

import com.slyashenko.model.Category;
import com.slyashenko.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String homePage(Model model){

        List<Category> categoryList = categoryService.getAllCategories();
        model.addAttribute("categories", categoryList);

        return "home";
    }
}
