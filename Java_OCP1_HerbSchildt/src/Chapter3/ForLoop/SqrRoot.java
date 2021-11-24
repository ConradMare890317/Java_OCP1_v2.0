package ForLoop;

public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rrer;

        for(num = 1.0; num < 100; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sroot);

            // Compute rounding error.
            rrer = num - (sroot * sroot);
            System.out.println("Rounding error is " + rrer);
            System.out.println();
        }
    }
}
