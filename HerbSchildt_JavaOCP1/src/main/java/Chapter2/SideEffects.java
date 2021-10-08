package Chapter2;

class SideEffects {
    public static void main(String[] args) {
        int i;

        i = 0;

        // i is still incremented even though the if statement fails.
        if(false & (++i < 100))
            System.out.println("This won't be displayed");
        System.out.println("if statement executed: " + i); // displays 1

        // i is not incremented, the short-circuit operator skips the increment.
        if(false && (++i < 100))
            System.out.println("This won't be displayed");
        System.out.println("if statement executed: " + i); // STILL 1!
    }
}
