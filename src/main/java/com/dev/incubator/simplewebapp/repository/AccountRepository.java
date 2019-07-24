package com.dev.incubator.simplewebapp.repository;

import com.dev.incubator.simplewebapp.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByIdAccount(Long id);

}