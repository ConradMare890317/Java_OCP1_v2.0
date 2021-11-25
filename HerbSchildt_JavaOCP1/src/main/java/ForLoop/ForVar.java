package ForLoop;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // compute the factorial of the numbers through 5
        for(int i = 1; i < 5; i++) {
            sum += i; // i is know throughout the loop
            fact *= i;
        }
        // but, i is NOT known here
        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}
