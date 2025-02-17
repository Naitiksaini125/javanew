import java.util.Random;
import java.util.Scanner;

public class guessnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int min = 1;
        int max = 100;
        int number = sc.nextInt(max-min +1)+ min;
        System.out.println( "i have guess a number between" +min + "and" +max+ "can you guess it");
        int guess ;
        int attempts = 0;
        boolean hasGuessed = false;
        while( ! hasGuessed){
            System.out.println("enter your number");
            guess = sc.nextInt(); attempts++;
            if (guess < number) {
                System.out.println("low ! try again");
            }
            if (guess > number) {
                System.out.println("high ! try again");
            }
            else{
                hasGuessed = true;
                System.out.println("you have guessed the number ! "+number+ "in"+attempts+ "attempts");
                sc.close();

            }
        }
    }
}