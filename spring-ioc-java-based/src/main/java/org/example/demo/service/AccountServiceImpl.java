package org.example.demo.service;

import java.util.List;

import org.example.demo.dao.AccountDao;
import org.example.demo.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceImpl implements AccountService {

	
	private AccountDao accountDaoImpl;

	@Autowired
	public AccountServiceImpl(AccountDao accountDaoImpl) {

		this.accountDaoImpl = accountDaoImpl;
	}

	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDaoImpl.createAccount(account);
	}

	@Override
	public List<Account> displayAllAvailableAccount() {
		// TODO Auto-generated method stub
		return accountDaoImpl.displayAllAvailableAccount();
	}

}