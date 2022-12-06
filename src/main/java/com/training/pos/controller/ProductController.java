package com.training.pos.controller;

import com.training.pos.dao.ProductDao;
import com.training.pos.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product){
      return productDao.addProduct(product);
    }

    @PostMapping("/update-product")
    public Product updateProduct(@RequestBody Product product){
        return productDao.updateProduct(product);
    }

    @GetMapping("/all-products")
    public List<Product> getAllProduct(){
        return productDao.getAllProducts();
    }

    @GetMapping("/delete-product/{id}")
    public void deleteProductById(@PathVariable("id") Integer id){
        productDao.deleteProductById(id);
    }

    @GetMapping("/find-product-id/{id}")
    public Product findProductById(@PathVariable("id") Integer id){
        return productDao.findById(id);
    }

    @GetMapping("/find-product-code")
    public Product FindProductByCode(@RequestParam String code){
       return productDao.findByCode(code);
    }

}
