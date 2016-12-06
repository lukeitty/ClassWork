/** 
 * Felicia Ho, Luke Ittycheria, Christine Shao, Andrew Lee
 * Tic Tac Toe game for two players
 * Uses a changeable dimension board and user's pick of symbols.
 * Can play game over and over again if the user wishes to, and uses some error-handling
 * procedures to make sure the user does not input anything completely out of bounds.
 */
 
 import java.util.Scanner; //import the scanner class from the package to use the user input
 //feature
 
 public class TicTacToe
 {
 
 	public static String[][] board; //global variable initialization of board - 2d list of string
 	//to hold the user's symbols/tic tac toe board
 	
 	/**
 	 * Main function 
 	 * Introduces the user to the game by asking for the dimensions, the symbols, and
 	 * Choosing who starts first randomly. Also controls whether or not the game is played again
 	 * using a while loop. Overall lots of user interaction.
 	 * @param args command line argument
 	 */
 	public static void main (String[] args)
 	{
 		
 		boolean continueGame = true; //set the continueGame to true and use it as a switch
 		while (continueGame) //continue through this loop until the user does not want to play anymore
 		{
 			//introduction to user
 			System.out.print("Welcome to the Tic-Tac-Toe game! This is a two-player game.");
 			System.out.print("Grab a friend and play! Please follow the instructions.");
 			System.out.println("Good luck!");
 			
 			//"changeable" dimensions of the board based on what the user wants
 			System.out.print("How big do you want your board to be? __ x ___: ");
 			Scanner kb = new Scanner(System.in); //user input
 			int dimensions = Integer.parseInt(kb.nextLine()); //have to typecast the 
 			//string input from the user to an integer 
 			//dimensions for the board
 			
 			initBoard(dimensions, dimensions); //initializing the board with the user's dimensions
 			//must be a square, so rows and columns are the same
 			
 			//player 1 symbol input
 			System.out.println("Player 1, please input what symbol you would like. ");
 			String pS1 = kb.nextLine();
 			
 			//player 2 symbol input
 			System.out.println("Player 2, please input what symbol you would like. ");
 			String pS2 = kb.nextLine();
 			
 			//error handling
 			//prevents the two players having the same symbol
 			while (pS2.equals(pS1))
 			{
 				System.out.print("Sorry, that symbol was taken by player 1. ");
 				System.out.print("Player 2, please re-input what symbol you would like. ");
 				pS2 = kb.nextLine();
 			}
 			
 			//randomly select a player by randomly choosing a number either 0 or 1
 			int first = (int) (Math.random() * 2);
 			
 			if (first == 0) //if 0, then player 1 starts
 				System.out.println("Player 1 to start!");
 			
 			else //else, player 2
 				System.out.println("Player 2 to start!");
 		
 			playGame(pS1, pS2, first); //play the game by calling playGame 
 			//pass in symbols (so you can check winners)
 			//pass in who played first so that you can switch players/turns
 			
 			//whether or not to end the game
 			System.out.print("Hope you liked it! Would you like to play again? ");
 			String endGame = kb.nextLine();
 			//if user does not want to, types no and the game will end
 			//because continueGame no longer true
 			if (endGame.equals("no"))
 			{
 				continueGame = false;
 			}
 			else //otherwise, keep playing
 			{
 				continueGame = true;
 			}
 		
 		}
 	
 
 	}
 	
 	/**
 	 * Initialize the board 
 	 * Algorithm: Use for loops (nested) to go through each "array"
 	 * by putting empty strings in it
 	 * This way, won't have the issue of integers in the board
 	 * Only when printing will the program finally print the integers
 	 * No need to store anything in this array except the users' symbols (string)
 	 * @param rows dimensions 
 	 * @param cols dimensions
 	 */
 	public static void initBoard(int rows, int cols)
 	{
 		board = new String[rows][cols]; //initiate the global variable's size
 		
 		for (int row = 0; row < rows; row++) //go through the rows of the board 
 		{
 			for (int col = 0; col < cols; col++) //go through the columns of each row
 			{
 				board[row][col] = ""; //each item in the 2-D list should be an empty array
 				//to fill it for now - and then later add symbols in 
 			}
 		}
 	
 	}
 
 	/**
     * Prints the board based upon initBoard() and printDashes()
     * goes through the rows of the global board
     * and goes through the columns of the global board
     * by using two nested for loops.
     * each item in a row is separated by a “|”
	 * and each row is separated by dashes determined
	 * by printDashes()
	 */
 	public static void printBoard()
 	{
 		for(int row = 0; row < board.length; row++) //go through the rows of the array
 		{
 			printDashes(board[row].length); //-------------------- print dashes with helper function
 			System.out.print("|"); //print first grid separation
 			
 			for(int col = 0; col < board[row].length; col++) //go through the columns of the array
 			{ 
 				
 				if (!board[row][col].equals("")) //extra space for single digit numbers
 				{
 					System.out.print(" " + board[row][col] + " |"); //go through each item of the array and print
 				} 
 				else 
 				{ 
 					int index = board.length * row + col; //calculate the index 
 					if (index > 10)
 					{
 						System.out.print(" " + index + " |");
 					}
 					else
 					{
 						System.out.print(" " + index + "  |");
 					}
 				}
 			}
 			System.out.println();
 		}
 		printDashes(board[0].length); //prints final row of dashes
 		
 	}
 	
 	/**
     * this method determines how many dashes
     * should be used between each row of numbers.
     * prints 5 dashes for every 1 unit of length
     * of the row length
     * @param n This is the row length
	 */

 	public static void printDashes(int n)
 	{
 		//loops through the amount of length given
 		for (int dash = 0; dash < n; dash++)
 		{
 			System.out.print("-----"); //prints 5 dashes for every amount of "length"
 		}
 		System.out.println("");
 	}
 
 	/** 
 	 * Play Game controls the whole framework behind the entire game
 	 * Sets the status to playing - so that whenever a user wins it can jump out of the loop
 	 * Otherwise, you must keep on checking winner etc. so you need a loop
 	 * Algorithm: Want to print the board, to keep the user updated on the game status
 	 * and for where to put the piece; places the piece based on user input (also has 
 	 * error handling for this). Then, check if there is a winner by passing it into the checkWinner
 	 * function, and switch players. Print the final board once someone has won/tied.
 	 * Based on the status, print congrats/lost/tie
 	 * @param pS1 player 1 symbol
 	 * @param pS2 player 2 symbol
 	 * @param first whoever is playing first/whoever was supposed to play first
 	 */
 	public static void playGame(String pS1, String pS2, int first)
 	{
 		int currentPlayer = first; //set the current player to whoever is supposed to be playing first
 		String status = "playing"; //set the status so you can break out of loop when you win
 		
 		while (status.equals("playing")) //continues while no one wins
 		{
 			printBoard(); //print board first
 			
 			//ask where to place the piece
 			if (currentPlayer == 0) //specialized for either player 1/2
 			{
 				System.out.print("Player 1, please input where you would to place your piece (a number). ");
 			}
 			else
 			{
 				System.out.print("Player 2, please input where you would to place your piece (a number). ");
 			}
 			
 			Scanner kb = new Scanner(System.in); //gets user input and must
 			//typecast it from string to int
 			int currPlay = Integer.parseInt(kb.nextLine());
 			
 			int row = currPlay/ board.length; //formula for finding the row to put the 
 			//user's choice in
 			int col = currPlay % board.length; //formula for finding the column to put 
 			//the user's choice in
 			
 			//error handling
 			while (currPlay < 0 || currPlay > (board.length * board.length) || !board[row][col].equals(""))
 			//must be greater than 0, must be within the boundaries of the board, and 
 			//must also be a space that has not been taken yet (empty string)
 			{
 				System.out.print("Sorry! You cannot play your piece there. Please reselect.");
 				currPlay = Integer.parseInt(kb.nextLine());
 				row = currPlay/ board.length; //formula for finding the row to put the 
 				//user's choice in --> reset
 				col = currPlay % board.length; //formula for finding the column to put 
 				//the user's choice in
 			}
 			
 			//place down the piece
			if (currentPlayer == 0)
			{
				board[row][col] = pS1; //place symbol 1 in the appropriate space
			}
			else
			{
				board[row][col] = pS2; //place symbol 2 in the appropriate space
			}
 			
 			//checking if there is a winner and setting status of the game to this
 			status = checkWinner(pS1, pS2); 
 			
 			currentPlayer = (currentPlayer+1) % 2; //switch players based on formula
 			
 		}	
 		printBoard(); //print final board
 		
 		//prints the message based on the status
		if (status == "Player 1 win")
		{
			System.out.print("Player 1 wins! Congrats!");
		}
		else if (status == "Player 2 win")
		{
			System.out.print("Player 2 wins! Sorry :( ");
		}
 		else
 		{
 			System.out.print("It's a tie!");
 		}
 	
 	}
 	
 	/** 
 	 * Checks the winner - either player 1 or 2 or tie
 	 * Algorithm: First check the symbols against the symbolWin call (checks horizontal, 
 	 * vertical, diagonals)
 	 * If neither of them won, then check whether or not the board is filled
 	 * If it is not filled yet, then the game must continue
 	 * Otherwise, it's a tie (because no one won and the board is filled)
 	 * @param pS1 player symbol 1
 	 * @param pS2 player symbol 2
 	 * @return the status of the game (who won/tie etc.)
 	 */
 	public static String checkWinner(String pS1, String pS2)
 	{
 		//checks both symbols with the symbolWin call using player one's symbol and player
 		//two's symbol
 		if (symbolWin(pS1))
 		{
 			return "Player 1 win";
 		}
 		else if (symbolWin(pS2))
 		{
 			return "Player 2 win";
 		}
 		
 		//checking if the board is filled or not - whether to continue the game or not
 		for (int row = 0; row < board.length; row++) //go through the rows of the 2-D array
 		{
 			for (int col = 0; col < board[row].length; col++) //go through the columns 
 			//of the 2-D array 
 			{
 				if (board[row][col].equals("")) //if any of them are still empty, continue playing
 				{
 					return "playing";
 				}
 			}
 		}
 		
 		return "tie"; //otherwise its a tie
 	
 	}
 	
 	/**
     *This method checks the return values of 
     *horizontalCheck, verticalCheck, and diagonalCheck
     *Algorithm: Goes through three if statements 
     *If one of the methods called evaluate to true, 
     *the method will return a boolean value: true
     *If none of the methods called evaluate to false,
     *the method will return a boolean value: false
     *Goes through all possible combinations of winning the tic tac toe game by calling those three methods
     *@param symbol Player’s symbol
     *@return whether or not the player has won either horizontally, diagnoally, or vertically (through a boolean value)
     */

 	public static boolean symbolWin(String symbol)
 	{
 		if (horizontalCheck(symbol)) //checking horizontally
 		{
 			return true; //if they did win horizontally, return true (won)
 		}
		if (verticalCheck(symbol)) //checking vertically
		{
			return true; //if they did win vertically, return true (won)
		}
		if (diagonalCheck(symbol)) //checking diagonally
		{
			return true; //if they did win diagonally, return true (won)
		}
 		
 		return false; //if not any of them, return false (not won/tie)

 	}
 	
 	/**
	 * Checks to see if the same symbol is in every space of a particular row (if so, true is returned)
	 * Algorithm: Goes through every column in a specific row to check whether the item within that space is the same as the parameter (that being the symbol)
	 * If at any point a given space within a row is not the same as the given symbol, false will be returned
	 * Using nested for loops to check 
	 * Otherwise, true will be returned as every space within a given row is the same as the given symbol
	 * @param symbol This is the symbol that is being checked against with every space in a given row
	 * @return whether or not a single space in a given row is the same symbol as the other spaces
	*/
 	public static boolean horizontalCheck(String symbol)
 	{
 		for (int row = 0; row < board.length; row++) //go through each row first
 		{
 			boolean winning = true; //assume player is winning (switch) 
 			//reset each time so that the player won't always lose if they don't have EVERY row 
 			
 			for (int col = 0; col < board[row].length; col++) //go through each column of each row
 			{
 				if (!(board[col][row].equals(symbol))) //if the player's pieces don't match should
 				//be false
 				{
 					winning = false;
 				}
 			}
 			if (winning) //return the true winning as soon as the player fills an entire
 			//row with his/her symbol
 			{
 				return winning;
 			}
 			
 		}
 		
 		return false; //otherwise player did not get three in a row */
 	}
 		
 	/**
	 * Checks to see if the same symbol is in every space of a particular column (if so, true is returned)
	 * Algorithm: Goes through every row in a specific column to check whether the item within that space is the same as the parameter (that being the symbol)
	 * If at any point a given space within a column is not the same as the given symbol, false will be returned
	 * Otherwise, true will be returned as every space within a given column is the same as the given symbol
	 * Using nested for loops to check
	 * @param symbol This is the symbol that is being checked against with every space in a given column
	 * @return whether or not a single space in a given column is not the same symbol as the other spaces
	*/

 	public static boolean verticalCheck(String symbol)
 	{
 		for (int col = 0; col < board[0].length; col++) //go through each column first
 		{
 			boolean winning = true; 
 		
 			for (int row = 0; row < board.length; row++) //go through each row in that column
 			//so as to determine if a player has won
 			{
 				if (!(board[col][row].equals(symbol))) //if player's pieces don't match in
 				//each space, winning should not be true (and hence false)
 				{
 					winning = false;
 				}
 			}
 			if (winning) //return the true winning as soon as the player fills an entire
 			//column with his/her symbol
 				return winning;
 		}
 		return false;
 	}
 
 	/** 
     * This method checks if the same symbol
     * goes diagonally across the board (both directions)
     * Algorithm: Use for loops to obtain coordinates 
     * for each element in array
     * If the content in the element is equal to the symbol,
     * for loop continues, otherwise method returns false
     * First loop: the coordinates would be equal going down the first diagonal
     * Second loop: use formula below to find exact column where row is going through
	 * @param symbol Player’s symbol
	 * @return whether or not the player has won through the diagonals 
	 */

 	public static boolean diagonalCheck(String symbol)
 	{
 		boolean winning = true; 
 		
 		//first diagonal
 		for (int row = 0; row < board.length; row++)
 		{
 			if (!(board[row][row].equals(symbol)))//if player's pieces don't match
 			//winning should not be true (false)
 			{
 					winning = false;
 			}
 		}
 		
 		if (winning) //if user already won, return true
 			return winning;
 		
 		winning = true;
 		
 		//second diagonal
 		for (int row = 0; row < board.length; row++) //go through the rows
 		{
 			int col = board.length - 1 - row; //set the column to specific formula 
 			//to find the exact column of where the diagonal would be going through
 			
 			if (!(board[row][col].equals(symbol))) //if player's pieces don't match
 			//winning should not be true (false)
 			{
 					winning = false;
 			}
 		}
 		
 		return winning;
 	}
 	
 	
 }