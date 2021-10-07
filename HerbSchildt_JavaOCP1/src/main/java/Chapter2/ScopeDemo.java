package Chapter2;

class ScopeDemo {
    public static void main(String[] args) {
        int x; // known to all code within main

        x = 10;
        if (x == 10) { // start a new scope with curly-brace

            int y = 20; // known only in this block

            // x and y are both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100;  Error! y isn't known here

        // x is still known here
        System.out.println("x is " + x);
    }
}
