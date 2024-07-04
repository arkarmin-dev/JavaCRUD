package com.cgm.system.storage.demoStorage.web.controller;

import com.cgm.system.storage.demoStorage.bl.service.ProductService;
import com.cgm.system.storage.demoStorage.bl.service.ProductServiceImpl;
import com.cgm.system.storage.demoStorage.persistance.entity.Product;
import com.cgm.system.storage.demoStorage.web.form.ProductForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    //CREATE
    @GetMapping("/addProductForm")
    public ModelAndView addProductForm() {
        ProductForm productForm = new ProductForm();
        ModelAndView model = new ModelAndView();
        model.setViewName("/addProductForm");
        model.addObject("productForm", productForm);
        model.addObject("metaTitle", "Add Product | DemoStorage");
        return model;
    }

    @PostMapping("/addSuccess")
    public String addSuccess(@ModelAttribute("productForm")ProductForm productForm) {
        productService.addProduct(productForm);
        return "addSuccess";
    }

    //READ
    @GetMapping("/storage")
    public String storagePage(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "storage";
    }

    //UPDATE
//    @GetMapping("/edit/{id}")
//    public String editProductForm(@PathVariable Long prodId, Model model) {
//        Product product = productService.getProductById(prodId);
//        model.addAttribute("product", product);
//        model.addAttribute("metaTitle", "Edit Product");
//        return "editProductForm";
//    }

}
