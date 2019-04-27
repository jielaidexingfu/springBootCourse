package com.jun.jdbc.Service;

import com.jun.jdbc.Entity.Account;

import java.util.List;

public interface IAccountService {
    int add(Account account);
    int update(Account account);
    int delete(int id);
    Account findAccountById(int id);
    List<Account> findAccountList();
}
