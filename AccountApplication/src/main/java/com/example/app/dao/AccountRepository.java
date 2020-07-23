package com.example.app.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.app.entity.Account;

public interface AccountRepository extends CrudRepository<Account,Integer> {
	public Account findByAccountId(int id);
	public Account findByUserName(String name);
}
