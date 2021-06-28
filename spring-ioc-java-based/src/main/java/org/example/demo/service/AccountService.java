package org.example.demo.service;

import java.util.List;

import org.example.demo.pojo.Account;

public interface AccountService {
public Account createAccount(Account account);
	
	public List<Account> displayAllAvailableAccount();

}