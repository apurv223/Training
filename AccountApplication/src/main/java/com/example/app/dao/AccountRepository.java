package com.example.app.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.app.entity.Account;

public interface AccountRepository extends CrudRepository<Account,Integer> {

}
