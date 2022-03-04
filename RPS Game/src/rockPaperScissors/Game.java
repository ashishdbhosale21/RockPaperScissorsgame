package rockPaperScissors;

import java.util.Scanner;

public class Game {
	
	
	
	
	public static void main(String[] args) {
		
		int u = 0;
		int c = 0;
		System.out.println("*************************");
		System.out.println("Welcome to this FunWorld!");
	    System.out.println("*************************");
	    
		System.out.print("\nEnter the number of rounds you want to play : " );
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
		
		String playerChoice =  userSelected();
		String computerChoice = computerSelected();
		
		if(playerChoice.equals("q")) {
			System.out.println("GOODBYE!!!");
			return; 
		}
		System.out.println("\n--------------------------------------------------------------");
		System.out.println("user Input : " + playerChoice);
		System.out.println("computer Input : " + computerChoice);
		System.out.println("You " + getWinner(playerChoice, computerChoice));
		System.out.println("--------------------------------------------------------------");
		
		if (getWinner(playerChoice, computerChoice).equals("won")) {
			u++;
		}else if(getWinner(playerChoice, computerChoice).equals("lost")){
			c++;
		}else {
			u = u;
			c = c;
		}
	}	
		System.out.println("================================");
		if(u > c) {
			System.out.println("You won");
		}else if(u < c){
			System.out.println("Better luck next time!");
		}else {
			System.out.println("Wohhoo this is tie!!");
		}
		System.out.println("================================");
		}
	public static  String  userSelected() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter 'rock' or 'paper' or 'scissors'. anything else to quit: ");
		String input = sc.nextLine();
		
		if(input.equals("rock") || input.equals("paper") || input.equals("scissors")) {
			return input;
		}else {
			return "q";
		}
		
	}
	public static String computerSelected() {
		
		int num = (int) (Math.random() *3) +1;
		String choice;
		switch(num) {
		  
		case 1: 
			  choice = "rock";
			  break;
		case 2:
			choice = "paper";
			break;
		default: 
			choice = "scissors";
		}
		return choice;
	}
	public static String getWinner(String playerChoice, String computerChoice) {
		
		if(playerChoice.equals(computerChoice)) {
			return "tied";
		}
		String result;
		switch(playerChoice) {
		case "rock": 
			if(computerChoice.equals("scissors")) {
				result = "won";
			}else {
				result =  "lost";
			}
			break;
		case "paper": 
			if(computerChoice.equals("rock")) {
				result = "won";
			}else {
				result = "lost";
			}
			break;
		default:
			if(computerChoice.equals("paper")) {
				result = "won";
			}else {
				result = "lost";
			}
			
		}
		return result;
	}
}
