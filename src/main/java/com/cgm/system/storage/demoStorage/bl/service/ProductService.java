package com.cgm.system.storage.demoStorage.bl.service;

import com.cgm.system.storage.demoStorage.persistance.entity.Product;
import com.cgm.system.storage.demoStorage.web.form.ProductForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public void addProduct(ProductForm productForm);
    public List<Product> getProducts();
//    public Product getProductById(Long id);
}
