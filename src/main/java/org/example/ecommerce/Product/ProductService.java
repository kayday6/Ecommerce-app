package org.example.ecommerce.Product;

import java.util.List;
public interface ProductService {
    Product findById(long id);
    List<Product> findAll();

}
