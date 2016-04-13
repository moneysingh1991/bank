package cs_146_project;

import java.util.ArrayList;

/**
 * This class represents a list of accounts that is able to manage it by adding, and deleting.
 */
public class ListAccount
{
	private ArrayList<Account> list;
	
	/**
	 * Constructs the list
	 */
	public ListAccount()
	{
		list = new ArrayList<Account>();
	}
	
	/**
	 * Adds an account into the list
	 * @param account the account being added
	 */
	public void addAccount(Account account)
	{
		list.add(account);
	}
	
	/**
	 * Deletes the account given 
	 * @param account the account given
	 */
	public void deleteAccount(Account account)
	{
		list.remove(account);
	}
	
	/**
	 * Gets the account number by the index
	 * @param i the index of the account
	 */
	public Account getAccount(int i)
	{
		return list.get(i);
	}
	
//	public void setAccount(int index, Account acc)
//	{
//		list.
//	}
}
