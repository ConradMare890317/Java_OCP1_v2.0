package Chapter3;

// Guess the letter game, Version 2.0.6.3.1

public class Guess2 {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read();

        if(ch == answer) System.out.println("Correct!");
        else System.out.println("...Sorry, try again! Capital letters should also be considered...");
    }
}
