package tictactoe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TicTacToe1 {
	public static void displayBoard(char board[][]) {
		for (char y[] :board) {
			for (char c:y) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

	public static void insertPosition (char board[][],int position,String playerType) {
		char ch;
		if(playerType.equals("player")) {
			ch='X';
		} else {
			ch='O';
		}
		switch (position) {
		case 1:board[0][0]=ch;
		break;
		case 2:board[0][2]=ch;
		break;
		case 3:board[0][4]=ch;
		break;
		case 4:board[2][0]=ch;
		break;
		case 5:board[2][2]=ch;
		break;
		case 6:board[2][4]=ch;
		break;
		case 7:board[4][0]=ch;
		break;
		case 8:board[4][2]=ch;
		break;
		case 9:board[4][4]=ch;
		break;
		}
	}
	
	public static boolean checkBoard(int move, char board[][]){

	    switch (move){
	        case 1:
	            if(board[0][0] == ' '){
	                return true;
	            } else{
	                return false;
	            }
	        case 2:
	            if(board[0][2] == ' '){
	                return true;
	            } else{
	                return false;
	            }
	        case 3:
	            if(board[0][4] == ' '){
	                return true;
	            } else{
	                return false;
	            }

	        case 4:
	            if(board[2][0] == ' '){
	                return true;
	            } else{
	                return false;
	            }
	        case 5:
	            if(board[2][2] == ' '){
	                return true;
	            } else{
	                return false;
	            }
	        case 6:
	            if(board[2][4] == ' '){
	                return true;
	            } else{
	                return false;
	            }
	        case 7:
	            if(board[4][0] == ' '){
	                return true;
	            } else{
	                return false;
	            }
	        case 8:
	            if(board[4][2] == ' '){
	                return true;
	            } else{
	                return false;
	            }
	        case 9:
	            if(board[4][4] == ' '){
	                return true;
	            } else{
	                return false;
	            }

	        default:
	            return false;
	    }
	}
	
	public static boolean checkPlayerWin(char board[][]){


	    if(board[0][0] == 'X'&& board[0][2] == 'X' && board [0][4] == 'X' ){
	        System.out.println("Player Wins");
	        return true;
	    }

	    if(board[2][0] == 'X'&& board[2][2] == 'X' && board [2][4] == 'X' ){
	        System.out.println("Player Wins");
	        return true;
	    }

	    if(board[4][0] == 'X'&& board[4][2] == 'X' && board [4][4] == 'X' ){
	        System.out.println("Player Wins");
	        return true;
	    }




	    if(board[0][0] == 'X'&& board[2][0] == 'X' && board [4][0] == 'X' ){
	        System.out.println("Player Wins");
	        return true;
	     }


	    if(board[0][2] == 'X'&& board[2][2] == 'X' && board [4][2] == 'X' ){
	         System.out.println("Player Wins");
	         return true;
	     }


	    if(board[0][4] == 'X'&& board[2][4] == 'X' && board [4][4] == 'X' ){
	       System.out.println("Player Wins");;
	        return true;
	    }


	    
	    
	    
	    if(board[0][0] == 'X'&& board[2][2] == 'X' && board [4][4] == 'X' ){
	        System.out.println("Player Wins");
	        return true;
	    }


	    if(board[4][0] == 'X'&& board[2][2] == 'X' && board [0][4] == 'X' ){
	        System.out.println("Player Wins");
	        return true;
	    }
        if(board[0][0] != ' ' && board[0][2] != ' ' && board[0][4] != ' ' && board[2][0] !=' '&&
        		board[2][2] != ' ' && board[2][4] != ' ' && board[4][0] != ' ' && board[4][2] != ' ' && board[4][4] != ' '){
                System.out.println("Its a tie");
                return true;
            }



	return false;}
	
	
	public static boolean checkComputerWin(char board[][]){
		
		
	    if(board[0][0] == 'O'&& board[0][2] == 'O' && board [0][4] == 'O' ){
	        System.out.println("Computer Wins");
	        return true;
	    }
	    if(board[2][0] == 'O'&& board[2][2] == 'O' && board [2][4] == 'O' ){
	        System.out.println("Computer Wins");
	        return true;
	    }
	    
	    if(board[4][0] == 'O'&& board[4][2] == 'O' && board [4][4] == 'O' ) {
	        System.out.println("Computer Wins");
	        return true;
	    }
	    
	    
	    
	    if(board[0][0] == 'O'&& board[2][0] == 'O' && board [4][0] == 'O' ){
	        System.out.println("Computer Wins");
	        return true;
	      }
	    if(board[0][2] == 'O'&& board[2][2] == 'O' && board [4][2] == 'O' ){
	        System.out.println("Computer Wins");
	        return true;
	    }
	    if(board[0][4] == 'O'&& board[2][4] == 'O' && board [4][4] == 'O' ){
	        System.out.println("Computer Wins");
	        return true;
	    }
	    
	    
	    if(board[0][0] == 'O'&& board[2][2] == 'O' && board [4][4] == 'O' ){
	        System.out.println("Computer Wins");
	        return true;
	    }
	    if(board[4][0] == 'O'&& board[2][2] == 'O' && board [0][4] == 'O' ){
	        System.out.println("Computer Wins");
	        return true;
	    }
        if(board[0][0] != ' ' && board[0][2] != ' ' && board[0][4] != ' ' && board[2][0] !=' '&&
        		board[2][2] != ' ' && board[2][4] != ' ' && board[4][0] != ' ' && board[4][2] != ' ' && board[4][4] != ' '){
                System.out.println("Its a tie");
                return true;
            }
	    
	return false;}
	
	

}

public class TicTacToe {
	static boolean game = false;
	static boolean playAgain = true;
	static String input = "y";
	public static void main(String[] args) {
		char board [][] = {{' ','|',' ','|',' '},
						   {'-','+','-','+','-'},
				           {' ','|',' ','|',' '},
				           {'-','+','-','+','-'},
				           {' ','|',' ','|',' '},
		                    };
		

			
			Scanner scan = new Scanner(System.in);
			
			while (playAgain) {
			while (!game) {
				TicTacToe1.displayBoard(board);
				System.out.println("Player, kindly enter the position (1-9)");
				int ppos=scan.nextInt();
				TicTacToe1.checkBoard(ppos, board);
				while (!TicTacToe1.checkBoard(ppos, board)) {
					System.out.println("Position already taken, please select another position");
					ppos=scan.nextInt();
				} 					
				TicTacToe1.insertPosition(board,ppos,"player");
				if (TicTacToe1.checkPlayerWin(board)) {
					TicTacToe1.displayBoard(board);
					game=true;
				}
		
				
				if (!game) {
					TicTacToe1.displayBoard(board);
				}

				
				Random r = new Random();
				int cpupos = r.nextInt(1,10);
				TicTacToe1.checkBoard(cpupos, board);
				
				while (!TicTacToe1.checkBoard(cpupos, board)) {
					cpupos = r.nextInt(1,10);
				}
				TicTacToe1.insertPosition(board,cpupos,"cpu");
				if (TicTacToe1.checkComputerWin(board)) {
					TicTacToe1.displayBoard(board);
					game=true;
				}
				
				if (!game) {	
					TicTacToe1.displayBoard(board);
					System.out.println("CPU has entered the position.");
				}				
			}
			System.out.println("Do you want to play again? (y/n)");
			input = scan.next();
			if (input.equals("y")) {
				System.out.println("Let's play again!");
				game=false;
			    board[0][0] = ' ';
			    board[0][2] = ' ';
			    board[0][4] = ' ';
			    board[2][0] = ' ';
			    board[2][2] = ' ';
			    board[2][4] = ' ';
			    board[4][0] = ' ';
			    board[4][2] = ' ';
			    board[4][4] = ' ';
			} else if (input.equals("n")){
				System.out.println("Play again next time!");
				playAgain=false;
			}
		}	
	}

	}

	


