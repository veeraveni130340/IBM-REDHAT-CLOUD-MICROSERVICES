package org.example.account_service;


import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.example.account_service.dao.AccountDAO;
import org.example.account_service.dao.AccountDAOImpl;
import org.example.account_service.dto.AccountDTO;
import org.example.account_service.model.Account;
import org.example.account_service.model.AccountType;
import org.example.account_service.model.Address;
import org.example.account_service.model.City;

public class App 
{
	
	
    public static void main( String[] args ) throws SQLException
    {
    	AccountDAO accountDAO=new AccountDAOImpl();
		/*
		 * Account account=accountDAO.createAccount (new
		 * Account(UUID.randomUUID().toString(), AccountType.SAVINGS,"Marry" , new
		 * Address("2A", "INDIA", City.MUMBAI), 1000)); System.out.println(account);
		 */
    	List<AccountDTO> list=accountDAO.displayAllAccount();
    	for(AccountDTO dto:list)
    	{
    		System.out.println(dto);
    	}
    			
    }
}