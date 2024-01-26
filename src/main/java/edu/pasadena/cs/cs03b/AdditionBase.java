package edu.pasadena.cs.cs03b;

import helperFunctions.HelperFunctions;

import java.util.Scanner;

public class AdditionBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        * get the values from the user input.
        * */
        HelperFunctions.printLine("Which base number would you like to calculate (2 up to 16)");
        int baseNo = HelperFunctions.getUserInputInt(scanner);

        HelperFunctions.printLine("enter the length of digits for your two numbers");
        int m = HelperFunctions.getUserInputInt(scanner);

        //prevents double enter.
        HelperFunctions.getUserInputLine(scanner);
        HelperFunctions.printLine("Enter the the first number that is base of " + baseNo);
        String a = HelperFunctions.getUserInputLine(scanner);

        HelperFunctions.printLine("Enter the the second number that is base of " + baseNo);
        String b = HelperFunctions.getUserInputLine(scanner);
        /**
         * calculate addition, base from the specified base number and return its result.
         * */
        String finalResult = additionBaseNo(m, baseNo, a, b);
        HelperFunctions.printLine("The sum of " + a + " + " + b + " is: " + finalResult);

    }

    public static String additionBaseNo(int m, int baseNo, String a, String b) {
        String result = "";
        int carry = 0;
        int aInt = 0;
        int bInt = 0;
        int cInt = 0;
        char cChar;
        if(baseNo == 16){
            a = a.substring(2);
            b = b.substring(2);
        }
        for (int i = m - 1; i >= 0; i--) {
            //convert the character to an integer type with its
            //respective decimal value.
            aInt = HelperFunctions.getBaseNoCharToInt(a.charAt(i));
            bInt = HelperFunctions.getBaseNoCharToInt(b.charAt(i));
            cInt = aInt + bInt + carry;
            //check if there's a carry or not.
            if (cInt >= baseNo) {
                cInt -= baseNo;
                carry = 1;
            } else {
                carry = 0;
            }
            //convert its decimal integer value back to a character,
            //with respect of its bas number.
            cChar = HelperFunctions.getDecimalDigitToBaseNoChar(cInt);
            //concatenate the caracter to the string variable result.
            result = cChar + result;
        }
        //check if there's a carry to add.
        if (carry ==1) {
            result =  '1' + result;
        }
        if(baseNo==16){
            result = "0x" + result;
        }
        return result;
    }
}
