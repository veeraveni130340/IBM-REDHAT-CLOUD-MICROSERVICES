package org.example.demo.dao;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.example.demo.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDaoImpl implements AccountDao {

	private List<Account> list;

	@Autowired
	public AccountDaoImpl(List<Account> list) {
		this.list = list;
	}

	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		list.add(account);
		return account;
	}

	@Override
	public List<Account> displayAllAvailableAccount() {
		// TODO Auto-generated method stub
		return list;
	}

	public List<Account> getList() {
		return list;
	}

	public void setList(List<Account> list) {
		this.list = list;
	

	}
	
}