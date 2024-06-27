package com.cgm.system.storage.demoStorage.persistance.entity;

import com.cgm.system.storage.demoStorage.web.form.ProductForm;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "product_id")
    private Long prodId;

    @Column (name = "product_name")
    private String prodName;

    @Column (name = "product_quantity")
    private Integer prodQuantity;

    public Product(ProductForm productForm) {
        this.prodId = productForm.getProdId();
        this.prodName = productForm.getProdName();
        this.prodQuantity = productForm.getProdQuantity();
    }
}
