package com.slyashenko.controller;

import com.slyashenko.model.Product;
import com.slyashenko.service.CategoryService;
import com.slyashenko.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Kate on 01.05.17.
 */
@Controller
public class ProductController {


    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/product")
    public String productPage(@RequestParam(value = "id") Long id, Model model) {
        Product product = productService.getProductWithCategoryById(id);
        model.addAttribute("product", product);
        return "product";
    }

    @RequestMapping("/product/add")
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("allCategories", categoryService.getAllCategories());
        return "addProduct";
    }

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("product") Product product, Model model) {
        model.addAttribute("productName", productService.addProduct(product).getName());
        //System.out.println(id);
        model.addAttribute("allCategories", categoryService.getAllCategories());
        model.addAttribute("product", new Product());
        return "addProduct";
    }



}
