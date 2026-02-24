package org.example.ecommerce.Product;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "Products")
public class Product  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    public String name;
    public double price;
    public int quantity;
    public Product(long id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;



    }

    public Product() {

    }


    public long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {this.quantity = quantity;}
}
