package Chapter2;

class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;
        dresult = 10.0 / 3;
        drem = 10.0 % 3;

        System.out.println("result and remainder of 10 / 3: " + iresult + " " + irem);
        System.out.println("result of 10.0 / 3: " + dresult + " " + drem);
    }
}
