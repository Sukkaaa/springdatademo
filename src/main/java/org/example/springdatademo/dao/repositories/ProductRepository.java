package org.example.springdatademo.dao.repositories;

import org.example.springdatademo.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product, Long> {
    public List<Product> findByPrice(double price);
    public List<Product> deleteByPrice(double price);
}
