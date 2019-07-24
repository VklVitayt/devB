package com.dev.incubator.simplewebapp.rest;

import com.dev.incubator.simplewebapp.domain.Account;
import com.dev.incubator.simplewebapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/account")
@CrossOrigin
public class AccountApi {

    @Autowired
    private AccountService accountService;

    @GetMapping("/getAllAccount")
    private List<Account> getAllAccount(){
        return accountService.getAllAccount();
    }

    @GetMapping("/getAccountById/{id}")
    private Account getAccountById(@PathVariable Long id){
        return accountService.find(id);
    }

    @PostMapping("/postAccount")
    private void postAccount(@RequestBody Account account ){
        accountService.save(account);
    }

}