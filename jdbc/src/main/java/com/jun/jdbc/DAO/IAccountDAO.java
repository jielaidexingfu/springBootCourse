package com.jun.jdbc.DAO;

import com.jun.jdbc.Entity.Account;

import java.util.List;

public interface IAccountDAO {
    int add(Account account);
    int update(Account account);
    Account findAccountById(int id);
    List<Account> findAccountList();
    int delete(int id);

}
