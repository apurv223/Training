package com.example.app.service;

import com.example.app.dto.AccountDto;
import com.example.app.entity.Account;
import com.example.app.shared.AccountEntityOnResponse;

public interface AccountService {
	public AccountEntityOnResponse createAccount(AccountDto accountDto);
	public Account findByAccountId(int id);
	public Account findByUserName(String name);
}
