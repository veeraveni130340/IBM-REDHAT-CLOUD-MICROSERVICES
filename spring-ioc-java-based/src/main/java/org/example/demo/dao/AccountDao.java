package org.example.demo.dao;

import java.util.List;

import org.example.demo.pojo.Account;

public interface AccountDao {
	
	public Account createAccount(Account account);
	
	public List<Account> displayAllAvailableAccount();
	
	

}