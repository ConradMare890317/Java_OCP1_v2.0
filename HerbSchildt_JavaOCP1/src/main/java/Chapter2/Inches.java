package Chapter2;

class Inches {
    public static void main(String args[]){
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There is " + ci + " cubic inches in a mile.");
    }
}
