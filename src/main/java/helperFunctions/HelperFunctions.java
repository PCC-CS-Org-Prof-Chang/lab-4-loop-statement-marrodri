package helperFunctions;

import java.util.Scanner;

public class HelperFunctions {
    /**
     * console output methods
     */
    public static void print(String str) {
        System.out.print(str);
    }

    public static void printLine(String str) {
        System.out.println(str);
    }

    /**
     * user input getters methods
     * */
    public static int getUserInputInt(Scanner input) {
        return input.nextInt();
    }

    public static String getUserInputLine(Scanner input) {
        return input.nextLine();
    }

    public static double getUserInputDouble(Scanner input) {
        return input.nextDouble();
    }

    /**
     * convert its character base number,from binary up to hexadecimal,
     * to a decimal integer.
     */
    public static int getBaseNoCharToInt(char baseNoChar) {
        if (baseNoChar >= '0' && baseNoChar <= '9') {
            return (int) (baseNoChar - '0');
        }
        switch (Character.toUpperCase(baseNoChar)) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
        }
        return 0;
    }

    /**
     * convert its decimal digit integer to a character value. it can return
     * from its binary term, up to hexadecimal term value.
     */
    public static char getDecimalDigitToBaseNoChar(int decimalDigit) {
        if (decimalDigit >= 0 && decimalDigit <= 9) {
            return (char) (decimalDigit + '0');
        }
        switch (decimalDigit) {
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
        }
        return 0;
    }
}
