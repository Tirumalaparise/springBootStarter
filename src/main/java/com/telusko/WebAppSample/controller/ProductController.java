package com.telusko.WebAppSample.controller;


import com.telusko.WebAppSample.model.Product;
import com.telusko.WebAppSample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private  ProductService prod_serv;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return prod_serv.getProducts();
    }


    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return prod_serv.getProductByID(prodId);
    }

    @PostMapping("/products")
    public void addProductnew(@RequestBody Product prod){
        System.out.println("Received product is");
        System.out.println(prod);
        prod_serv.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        System.out.println(prod);
        prod_serv.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        prod_serv.deleteProduct(prodId);
    }
}
