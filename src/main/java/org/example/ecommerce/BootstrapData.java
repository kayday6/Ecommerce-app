package org.example.ecommerce;

import org.example.ecommerce.Product.Product;
import org.example.ecommerce.Product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
     private final ProductRepository productRepository;
public BootstrapData(ProductRepository productRepository) {
    this.productRepository = productRepository;
}
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting Bootstrap Data ...");
        Product p1 = new Product();
        //p1.setId(1L);
        p1.setName("Apple");
        p1.setPrice(100);
        productRepository.save(p1);

        Product p2 = new Product();
        //p2.setId(2L);
        p2.setName("Banana");
        p2.setPrice(200);
        productRepository.save(p2);



    }
}
