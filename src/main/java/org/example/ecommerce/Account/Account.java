package org.example.ecommerce.Account;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account", schema = "schema")
public class Account {
    private long id;
    private String name;
    private BigDecimal amount;
}
