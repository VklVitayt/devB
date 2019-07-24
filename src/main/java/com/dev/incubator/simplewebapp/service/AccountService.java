package com.dev.incubator.simplewebapp.service;


import com.dev.incubator.simplewebapp.domain.Account;
import com.dev.incubator.simplewebapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    public Account find(Long id) {
        return accountRepository.findByIdAccount(id);
    }

    public void save(Account account){
        accountRepository.save(account);
    }

}