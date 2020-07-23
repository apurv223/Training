package com.example.app.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.dto.AccountDto;
import com.example.app.service.AccountService;
import com.example.app.shared.AccountEntityOnRequest;
import com.example.app.shared.AccountEntityOnResponse;

@RestController
@RequestMapping("/api/v-2")
public class AccountController {
    @Autowired
    AccountService accountService;
    
    @PostMapping("/account")
    public ResponseEntity<AccountEntityOnResponse> createUser(@RequestBody AccountEntityOnRequest accountDetails)
    {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AccountDto accountDto=mapper.map(accountDetails,AccountDto.class);
        accountService.createAccount(accountDto);
        AccountEntityOnResponse accountResponseModelEntity=mapper.map(accountDto,AccountEntityOnResponse.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(accountResponseModelEntity);
    }

}
