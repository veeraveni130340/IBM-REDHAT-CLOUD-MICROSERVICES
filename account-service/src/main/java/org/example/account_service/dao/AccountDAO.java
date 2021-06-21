package org.example.account_service.dao;

import java.sql.SQLException;
import java.util.List;

import org.example.account_service.dto.AccountDTO;
import org.example.account_service.model.Account;

public interface AccountDAO {

	public Account createAccount(Account account) throws SQLException;

	public List<AccountDTO> displayAllAccount() throws SQLException;

	public void deposite(double amount) throws SQLException;

	public double withdrawl(double amount) throws SQLException;

}
