package com.dev.incubator.simplewebapp.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "accountid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAccount;

    @Column(name = "account")
    @NonNull
    private int account;

    @Column(name = "userid")
    @NonNull
    private int userid;

    public int getIdaccount() {
        return idAccount;
    }

    public void setIdaccount(int idaccount) {
        this.idAccount = idaccount;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}

