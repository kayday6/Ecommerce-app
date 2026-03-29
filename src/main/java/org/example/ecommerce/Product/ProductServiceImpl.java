package org.example.ecommerce.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final List<Product> products = new ArrayList<>();
@Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    @Override
    public List<Product> findAll(){
        return (List<Product>)  productRepository.findAll();
    }

    @Override
    public Product findById(long id) {
        return null;
    }






}
