package com.shopsy.main.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.shopsy.main.entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {

}
