package com.example.app.service;

import com.example.app.dto.AccountDto;
import com.example.app.shared.AccountEntityOnResponse;

public interface AccountService {
	public AccountEntityOnResponse createAccount(AccountDto accountDto);

}
