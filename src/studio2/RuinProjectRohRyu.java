package studio2;

import java.util.Scanner;

public class RuinProjectRohRyu {
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Please enter your buy in: ");
		int buyIn = sc.nextInt();
		
		System.out.print("Please enter the winning chance of the game you are in: ");
		double winChance = sc.nextDouble();
		
		System.out.print("Please enter your amount of gain to be buy out: ");
		int buyOut = sc.nextInt();
		
		
		

		 System.out.print("Please enter the number of simulations you want to run: ");
	        int simulation = sc.nextInt();
        
		
		
		for (int i = 0; i < simulation; i++) {

		
       
        int money = buyIn;
        while (money < buyOut && money > 0) {
        	
        	double randomNumber = (Math.random());
            System.out.println("Random number: " + randomNumber);
            
        	if (randomNumber > winChance) {
                System.out.println("You lose a game: "  );
                System.out.println(money --);

            } else { 
                System.out.println("You win a game " );
                System.out.println(money ++);

            } 
        }
        
            
		}
		
        
        
        
     
		

		
	}
}
