package com.training.pos.dao;

import com.training.pos.entity.Product;
import com.training.pos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDao {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
       return productRepository.save(product);
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void deleteProductById(Integer id){
         productRepository.deleteById(id);
    }

    public Product findById(Integer id){
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.isPresent() ? optionalProduct.get() : null ;
    }

    public Product findByCode(String Code){
        Optional<Product> optionalProduct = Optional.ofNullable(productRepository.findByCode(Code));
        return optionalProduct.isPresent() ? optionalProduct.get() : null ;
    }

}
