/**
 * @author Imed BOUBAKER
 *
 * Convert divisible number class
 */
public class ConvertDivisibleNumber {

    public static final String EMPTY = "";
    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";

    /**
     * Static method that prints numbers from 1 to 100, one number per line. For each printed number,
     * use the following rules:
     * if the number is divisible by 3 or contains 3, replace 3 by "Foo";
     * if the number is divisible by 5 or contains 5, replace 5 by "Bar";
     * if the number contains 7, replace by "Qix";
     */
    public static void divisible() {
        for (int i = 1; i <= 100; i++) {
            String str = String.valueOf(i);
            if (i % 3 == 0) {
                System.out.print(FOO);
                if (i % 5 == 0) {
                    System.out.print(BAR);
                }
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '3') {
                        System.out.print(FOO);
                    }
                    if (str.charAt(j) == '5') {
                        System.out.print(BAR);
                    }
                    if (str.charAt(j) == '7') {
                        System.out.print(QIX);
                    }
                }
                System.out.println(EMPTY);
            } else if (i % 5 == 0) {
                System.out.print(BAR);
                if (i % 3 == 0) {
                    System.out.print(FOO);
                }
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '3') {
                        System.out.print(FOO);
                    }
                    if (str.charAt(j) == '5') {
                        System.out.print(BAR);
                    }
                    if (str.charAt(j) == '7') {
                        System.out.print(QIX);
                    }
                }
                System.out.println(EMPTY);
            } else if (str.contains("3") || str.contains("5") || str.contains("7")) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '3') {
                        System.out.print(FOO);
                    }
                    if (str.charAt(j) == '5') {
                        System.out.print(BAR);
                    }
                    if (str.charAt(j) == '7') {
                        System.out.print(QIX);
                    }
                }
                System.out.println(EMPTY);
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        ConvertDivisibleNumber.divisible();
    }
}
