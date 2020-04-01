package com.summerproj.repository;

import com.github.alperkurtul.firebaserealtimedatabase.annotation.FirebaseRealtimeDbRepoServiceImpl;
import com.summerproj.entity.Product;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository extends FirebaseRealtimeDbRepoServiceImpl<Product, String> {
}