package com.K21CNT1.NQK.lesson11.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.K21CNT1.NQK.lesson11.Model.Nqk_account;
import com.K21CNT1.NQK.lesson11.Repository.Nqk_accountRepository;

@Service
public class Nqk_accountService {

    private final Nqk_accountRepository Nqk_AccountRepository;

    @Autowired
    public Nqk_accountService(Nqk_accountRepository Nqk_AccountRepository) {
        this.Nqk_AccountRepository = Nqk_AccountRepository;
    }

    // Create or update an account
    public Nqk_account saveAccount(Nqk_account account) {
        return Nqk_AccountRepository.save(account);
    }

    // Retrieve all accounts
    public List<Nqk_account> getAllAccounts() {
        return Nqk_AccountRepository.findAll();
    }

    // Find an account by ID
    public Nqk_account getAccountById(Long id) {
        return Nqk_AccountRepository.findById(id).orElse(null);
    }

    // Find an account by User
//    public Nqk_account getAccountByUser(String user) {
//        return Nqk_AccountRepository.findByNqk_User(user);
//    }

    // Delete an account by ID
    public void deleteAccount(Long id) {
        Nqk_AccountRepository.deleteById(id);
    }
}
