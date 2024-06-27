package com.cgm.system.storage.demoStorage.bl.service;


import com.cgm.system.storage.demoStorage.persistance.dao.ProductDAO;
import com.cgm.system.storage.demoStorage.persistance.entity.Product;
import com.cgm.system.storage.demoStorage.web.form.ProductForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDAO prodDB;

    public List<Product> getProducts(){
        return prodDB.findAll();
    }

    @Override
    public void addProduct(ProductForm productForm) {
        Product product = new Product(productForm);
        this.prodDB.save(product);
    }
}
