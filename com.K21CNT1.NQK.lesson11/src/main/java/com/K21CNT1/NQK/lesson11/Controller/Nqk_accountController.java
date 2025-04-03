package com.K21CNT1.NQK.lesson11.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.K21CNT1.NQK.lesson11.Model.Nqk_account;
import com.K21CNT1.NQK.lesson11.Service.Nqk_accountService;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class Nqk_accountController {

    private final Nqk_accountService Nqk_AccountService;

    @Autowired
    public Nqk_accountController(Nqk_accountService Nqk_Service) {
        this.Nqk_AccountService = Nqk_Service;
    }

    // Create or Update an Account
    @PostMapping
    public ResponseEntity<Nqk_account> createOrUpdateAccount(@RequestBody Nqk_account account) {
        Nqk_account savedAccount = Nqk_AccountService.saveAccount(account);
        return ResponseEntity.ok(savedAccount);
    }

    // Get All Accounts
    @GetMapping
    public ResponseEntity<List<Nqk_account>> getAllAccounts() {
        List<Nqk_account> accounts = Nqk_AccountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }

    // Get Account by ID
    @GetMapping("/{id}")
    public ResponseEntity<Nqk_account> getAccountById(@PathVariable Long id) {
        Nqk_account account = Nqk_AccountService.getAccountById(id);
        return (account != null) ? ResponseEntity.ok(account) : ResponseEntity.notFound().build();
    }

    // Get Account by Username
//    @GetMapping("/username/{user}")
//    public ResponseEntity<Nqk_account> getAccountByUser(@PathVariable String user) {
//        Nqk_account account = Nqk_AccountService.getAccountByUser(user);
//        return (account != null) ? ResponseEntity.ok(account) : ResponseEntity.notFound().build();
//    }

    // Delete an Account by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Long id) {
        Nqk_AccountService.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }
}
