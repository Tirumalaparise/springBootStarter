package com.telusko.WebAppSample.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


import com.telusko.WebAppSample.Repository.ProductRepo;
import com.telusko.WebAppSample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductByID(int productId) {
        return repo.findById(productId).orElse(new Product());
    }

    public void addProduct(Product prod){
        System.out.println(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);

    }
}
