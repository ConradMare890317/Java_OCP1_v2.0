package Chapter3;

public class Guess3 {
    public static void main(String[] args)
        throws java.io.IOException {

            char ch, answer = 'K';

            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.print("Can you guess it: ");

            ch = (char) System.in.read(); // get answer

            if(ch==answer) System.out.println("*** Right ***");
            else{
                System.out.println("... Sorry, try again.");

                // a nested if statement
                if(ch < answer) System.out.println("Too low...");
                else System.out.println("Too high...");
            }

        }
    }
