package Chapter2;

class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // cast double to int
        System.out.println("Integer outcomes of x / y: " + i);

        i = 100; // a byte can hold 100
        b = (byte) i;
        System.out.println("Value of b: " + b);

        i = 257; // information loss, a byte can't hold 257
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for X
        ch = (char) b; // cast between incompatible types
        System.out.println("ch: " + ch);
    }
}
