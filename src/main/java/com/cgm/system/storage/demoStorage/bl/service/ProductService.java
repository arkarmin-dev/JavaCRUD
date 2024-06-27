package com.cgm.system.storage.demoStorage.bl.service;

import com.cgm.system.storage.demoStorage.web.form.ProductForm;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    public void addProduct(ProductForm productForm);
}
