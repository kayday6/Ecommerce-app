package org.example.ecommerce.Product;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public String viewProducts(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "products.html";
    }
    @PostMapping(path = "/products")
    public String addProduct(
            @RequestParam String name,
            @RequestParam double price,
            Model model
    ) {
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        productService.save(p);
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "redirect:/products";
    }
}
