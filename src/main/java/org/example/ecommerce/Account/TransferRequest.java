package org.example.ecommerce.Account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransferRequest {
    private long senderAccountID;
    private long receiverAccountID;
    private BigDecimal amount;
}
