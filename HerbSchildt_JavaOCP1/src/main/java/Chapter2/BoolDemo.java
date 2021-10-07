package Chapter2;

class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if(b) System.out.println("a boolean can control the if statement.");

        b = false;
        if(b) System.out.println("Not printed.");

        // outcome of a relational value is a boolean
        System.out.println("10 > 9 is " + (10 > 9));
    }
}
