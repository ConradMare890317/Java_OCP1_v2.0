package Chapter3;

public class NestedSwitch {
    public static void main(String[] args) {
        int ch1;
        int ch2;

        ch1 = 'A';
        ch2 = 'B';

        switch (ch1) {
            case 'A': System.out.println("This A is part of outer switch");
                switch (ch2) {
                    case 'A':
                        System.out.println("This A is part of inner switch");
                        break;
                    case 'B' : // ...
                        // end of inner switch.
                }
                break;
            case 'B' :
        }
    }
}
