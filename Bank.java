package cs_146_project;

import java.io.File;
import java.util.Scanner;


/**
 * Model class that represents all the data in a bank application
 */
public class Bank implements UpdateInterface
{
	private ListAccount accountList; // ArrayList of accounts
	private Scanner in; // Scanner for the file reader
	private UpdateInterface view;
	
	/**
	 * Constructs the bank
	 */
	public Bank()
	{
		accountList = new ListAccount();;
		this.loadFromFile();
	}
	
	public void loadFromFile()
	{

	}

	/**
	 * This methods adds an account to the list
	 * @param account the account that is being added
	 */
	public void addAccount(Account account)
	{
		accountList.addAccount(account);
	}
	
	/**
	 * Sends data that update a viewer
	 */
	public void update(Object... data)
	{
//		Player player = currentPlayer;
//		this.playTurn(player);
//		view.update(isWinner, d.getDie_1(), d.getDie_2(), player
//				.getCurrentScore(), player.getName(), player.getPiece()
//				.getCurrentPosition(), player.getPiece().getPreviousPosition(),
//				board.getSpace(player.getPiece().getCurrentPosition())
//						.getGoAgain());
//
//		//If it goesAgain
//		if(isGoingAgain(player)) nextPlayer = currentPlayer;
//		else nextPlayer = playerList.get(index);
//		
//		//Change player's turn
//		currentPlayer = nextPlayer;
//		index++;
//		if(index > 1) index = 0;
	}
	
	/**
	 * Sets a connection between the model and the view
	 * @param newView the view being sent to
	 */
	public void setView(UpdateInterface newView)
	{
		this.view = newView;
	}
}
