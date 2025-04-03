package com.K21CNT1.NQK.lesson11.Controller;

import org.springframework.ui.Model;
import com.K21CNT1.NQK.lesson11.Model.NQK_Account;
import com.K21CNT1.NQK.lesson11.Service.NQKAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/accounts")
public class NQKAccountController {
    @Autowired
    private NQKAccountService service;

    @GetMapping
    public String listAccounts(Model model) {
        model.addAttribute("accounts", service.getAllAccounts());
        return "NQK-account-list";
    }

    @GetMapping("/add")
    public String addAccountForm(Model model) {
        model.addAttribute("account", new NQK_Account());
        return "nqk-account-add";
    }

    @PostMapping("/add")
    public String addAccount(@ModelAttribute NQK_Account account) {
        service.addAccount(account);
        return "redirect:/accounts";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("account", service.getAccountById(id));
        return "NQK-account-edit";
    }

    @PostMapping("/edit/{id}")
    public String editAccount(@PathVariable Long id, @ModelAttribute NQK_Account account) {
        service.updateAccount(id, account);
        return "redirect:/accounts";
    }

    @PostMapping("/delete/{id}")
    public String deleteAccount(@PathVariable Long id) {
        service.deleteAccount(id);
        return "redirect:/accounts";
    }
}
