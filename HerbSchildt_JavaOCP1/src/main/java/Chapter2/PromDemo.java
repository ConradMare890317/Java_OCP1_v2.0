package Chapter2;

class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // no cast needed

        b = 10;
        b = (byte) (b * b); // cast needed to assign int to byte

        System.out.println("i and b: " + i + " " + b);
    }
}
