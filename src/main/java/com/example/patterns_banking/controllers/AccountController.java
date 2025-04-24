package com.example.patterns_banking.controllers;

import com.example.patterns_banking.dtos.AccountDTO;
import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.services.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
  private final AccountService accountService;

  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  @PostMapping
  public Account createAccount(@RequestBody AccountDTO account) {
    return accountService.createAccount(account);
  }

  @PostMapping("/{accountId}/deposit")
  public Account deposit(@PathVariable Long accountId, @RequestParam Double amount) {
    return accountService.deposit(accountId, amount);
  }

  @GetMapping
  public List<Account> listAccounts() {
    return accountService.listAccounts();
  }
}
