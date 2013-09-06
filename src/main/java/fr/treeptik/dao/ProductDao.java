package fr.treeptik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.treeptik.entity.Product;

public interface ProductDao  extends JpaRepository<Product, Integer>{
    
    
}