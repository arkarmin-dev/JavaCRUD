package com.cgm.system.storage.demoStorage.persistance.dao;

import com.cgm.system.storage.demoStorage.persistance.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {
}
