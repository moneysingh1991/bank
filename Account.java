package cs_146_project;
/**
 * This class represents a basic bank account that contains a account number,
 * account Name, and balance. This class is able to get and set their variables,
 * withdraw, deposit and transfer balance
 */
public class Account
{
	private String accountNumber; // account number
	private String accountName; // name of the account
	private double balance; // balance on the account

	/**
	 * Constructor that creates an account object with the given account numbr,
	 * account name, and balance
	 * @param accountNumber String the account number
	 * @param accountName String the name of the account
	 * @param balance double the balance on the account
	 */
	public Account(String accountNumber, String accountName, double balance)
	{
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	/**
	 * Gets the account number
	 * @return the account number
	 */
	public String getAccountNumber()
	{
		return accountNumber;
	}

	/**
	 * Gets the account name;
	 * @return the account name
	 */
	public String getAccountName()
	{
		return accountName;
	}
	
	/**
	 * Gets the balance of the account
	 * @return the account's balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * Sets a new account number
	 * @param String newAccountNumber the new account number
	 */
	public void setAccountNumber(String newAccountNumber)
	{
		accountNumber = newAccountNumber;
	}
	
	/**
	 * Sets a new account name
	 * @param String newAccountName the new account name
	 */
	public void setAccountName(String newAccountName)
	{
		accountName = newAccountName;
	}
	
	/**
	 * Sets a new balance
	 * @param newBalance double the new balance changed to
	 */
	public void setBalance (double newBalance)
	{
		balance = newBalance;
	}
	
	/**
	 * Withdraws an amount given from the balance
	 * @param amount the amount to be withdrawn
	 */
	public void withdraw(double amount)
	{
		if( balance - amount < 0) System.out.println("Insufficient funds");
		else balance -= amount;
	}
	
	/**
	 * Deposits an amount into the balance
	 * @param amount the amount to be deposit
	 */
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	/**
	 * Transfer a given amount from the current account to another account given
	 * @param account the account to be transfer to
	 * @param amount the amount to be transfer to
	 */
	public void transfer(Account account, double amount)
	{
		withdraw(amount);
		account.deposit(amount);
	}

}
