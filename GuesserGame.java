import java.util.*;

class Guesser {
	int guessNumber;
	
	int guessNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Here guesser is guessing a number...");
		guessNumber = scan.nextInt();
		System.out.println("Guesser has guessed an number, You can start game");
		return guessNumber;
	}
}
class Player
{
	int guessNumber;
	int numOfPlayers;
	int guessNumber()
	{
		System.out.println("Players guess an number!");
		Scanner scan = new Scanner(System.in);
		guessNumber = scan.nextInt();
		return guessNumber;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumberFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}
	void collectNumberFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
	}
	void compare() {
		if(numFromGuesser == numFromPlayer1) {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Game Tied between all Players");
				System.out.println("Please try another round");
				Umpire u = new Umpire();
				u.collectNumberFromGuesser();
				u.collectNumberFromPlayer();
				u.compare();
			}
			else if(numFromGuesser == numFromPlayer2) {
				System.out.println("Player1 and Player2 won the game");
				System.out.println();
				System.out.println("Player1 and Player2 want to try another round ?");
				
				int choice;
				
				System.out.println("Please Enter 1 to continue 0 to quit");
				Scanner scan = new Scanner(System.in);
				choice = scan.nextInt();
				
				switch(choice) {
				case 0:
					System.out.println("Succesffuly game quitted");
					break;
				case 1:
					Umpire u = new Umpire();
					u.collectNumberFromGuesser();
					u.collectNumberFromPlayer();
					u.compare();
				}
			}
			else if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player1 and Player3 won game");
				System.out.println();
				System.out.println("Player1 and Player3 want to try another round ?");
				
				int choice;
				
				System.out.println("Please Enter 1 to continue 0 to quit");
				Scanner scan = new Scanner(System.in);
				choice = scan.nextInt();
				
				switch(choice) {
				case 0:
					System.out.println("Succesffuly game quitted");
					break;
				case 1:
					Umpire u = new Umpire();
					u.collectNumberFromGuesser();
					u.collectNumberFromPlayer();
					u.compare();
				}

			}else {
				System.out.println("Player1 won the game");		
			}
		}else if(numFromGuesser == numFromPlayer2) {
			if(numFromGuesser == numFromPlayer2) {
				System.out.println("Player2 and Player3 won the game");
				System.out.println();
				System.out.println("Player2 and Player3 want to try another round ?");
				
				int choice;
				
				System.out.println("Please Enter 1 to continue 0 to quit");
				Scanner scan = new Scanner(System.in);
				choice = scan.nextInt();
				
				switch(choice) {
				case 0:
					System.out.println("Succesffuly game quitted");
					break;
				case 1:
					Umpire u = new Umpire();
					u.collectNumberFromGuesser();
					u.collectNumberFromPlayer();
					u.compare();
				}
			}else {
				System.out.println("Player2 won the game");				
			}
		}
		else if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player3 won the game");
		}
		else {
			System.out.println("No player won! Please try again");
		}
	}
}
public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Umpire u = new Umpire();
		
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayer();
		u.compare();
	}

}
