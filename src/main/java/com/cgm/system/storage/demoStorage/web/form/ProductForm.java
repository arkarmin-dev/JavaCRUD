package com.cgm.system.storage.demoStorage.web.form;

import com.cgm.system.storage.demoStorage.persistance.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductForm {
    private long prodId;
    private String prodName;
    private Integer prodQuantity;

    public ProductForm(Product product) {
        this.prodId = product.getProdId();
        this.prodName = product.getProdName();
        this.prodQuantity = product.getProdQuantity();
    }
}
