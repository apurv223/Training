package com.example.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.app.dao.AccountRepository;
import com.example.app.dto.AccountDto;
import com.example.app.entity.Account;
import com.example.app.shared.AccountEntityOnResponse;

@Service
@EnableTransactionManagement
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository accountRepository;
	
    @Override
    @Transactional
	public AccountEntityOnResponse createAccount(AccountDto accountDto)
	{
    	accountDto.setAccountId(223);
    	ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Account account=mapper.map(accountDto,Account.class);
        accountRepository.save(account);
        return mapper.map(account,AccountEntityOnResponse.class);
	}
    
    @Override
    @Transactional
	public Account findByAccountId(int id)
	{
    	
		return accountRepository.findByAccountId(id);
	}
    
    @Override
    @Transactional
	public Account findByUserName(String name)
	{
		return accountRepository.findByUserName(name);
	}

}
