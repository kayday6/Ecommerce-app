package org.example.ecommerce.Account;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class TransferService {

    public List<Account> getAllAccounts(){
        return accountRepository.findAllAccounts();
    }
    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney(long idSender,
                         long idReceiver,
                         BigDecimal amount) {
        Account sender =
                accountRepository.findAccountByID(idSender);
        Account receiver =
                accountRepository.findAccountByID(idReceiver);

        BigDecimal senderNewAmount =
                sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount =
                receiver.getAmount().add(amount);

        accountRepository.changeAmount(idSender, senderNewAmount);
        accountRepository.changeAmount(idReceiver, receiverNewAmount);
        
    }
}
