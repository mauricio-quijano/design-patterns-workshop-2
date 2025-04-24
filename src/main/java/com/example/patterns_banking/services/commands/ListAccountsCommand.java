package com.example.patterns_banking.services.commands;

import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.repositories.IAccountRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ListAccountsCommand implements ICommand<List<Account>> {
    private final IAccountRepository accountRepository;

    @Override
    public List<Account> execute() {
        return accountRepository.findAll();
    }
}
