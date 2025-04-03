package com.K21CNT1.NQK.lesson11.Service;

import com.K21CNT1.NQK.lesson11.Model.NQK_Account;
import com.K21CNT1.NQK.lesson11.Repository.NQKAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NQKAccountService {
    @Autowired
    private NQKAccountRepository repository;

    public List<NQK_Account> getAllAccounts() {
        return repository.findAll();
    }

    public void addAccount(NQK_Account account) {
        repository.save(account);
    }

    public void updateAccount(Long id, NQK_Account account) {
        NQK_Account existingAccount = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found"));
        // Cập nhật các trường khác nếu cần
        repository.save(existingAccount);
    }

    public NQK_Account getAccountById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
    }

    public void deleteAccount(Long id) {
        repository.deleteById(id);
    }
}

