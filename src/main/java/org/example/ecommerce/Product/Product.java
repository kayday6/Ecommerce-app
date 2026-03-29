package org.example.ecommerce.Product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public String name;
    public double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;




    }


}
