package com.cgm.system.storage.demoStorage.web.controller;

import com.cgm.system.storage.demoStorage.bl.service.ProductService;
import com.cgm.system.storage.demoStorage.bl.service.ProductServiceImpl;
import com.cgm.system.storage.demoStorage.persistance.entity.Product;
import com.cgm.system.storage.demoStorage.web.form.ProductForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import org.slf4j.Logger;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/storage")
    public String storagePage() {
        return "storage";
    }

    //CREATE
    @GetMapping("/addProductForm")
    public ModelAndView addProductForm() {
        ProductForm productForm = new ProductForm();
        ModelAndView model = new ModelAndView();
        model.setViewName("/addProductForm");
        model.addObject("productForm", productForm);
        return model;
    }

    @PostMapping("/addSuccess")
    public String addSuccess(@ModelAttribute("productForm")ProductForm productForm) {
        productService.addProduct(productForm);
        return "addSuccess";
    }

    //READ
    @PostMapping("storage")
    public String getProducts(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "storage";
    }

}
