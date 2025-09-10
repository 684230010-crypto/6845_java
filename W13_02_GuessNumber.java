package Loop;
import java.util.Random;
import java.util.Scanner;
public class W13_02_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();

        int answer = rand.nextInt(10) + 1; // Random number between 1 and 10
        
        // System.out.println("Random number is generated :" + answer);

        
        boolean win = false;

        // loop util the user guesses the correct number
        for(int countGuess = 0;countGuess < 3;countGuess++){
            System.out.println("Enter your guess (1-10) :");
            int guess = kb.nextInt();

            if(answer == guess){
                System.out.println("Correct! You've guessed the number");
                System.out.println("=============WIN==================");
                win = true;
                break;
            }else{
                System.out.println("Incorrect guess . Try again.");
                System.out.println("=============LOSE=================");
            }
            countGuess++;
        }
        if(win == false)
            System.out.println("Game Over . The correct number was: " + answer);

        kb.close();
        
    }
}
