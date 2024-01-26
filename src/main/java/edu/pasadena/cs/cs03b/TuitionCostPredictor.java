package edu.pasadena.cs.cs03b;
import java.util.Scanner;

import static helperFunctions.HelperFunctions.*;

public class TuitionCostPredictor {

	public static void main(String[] args) {

        /**
         * get the inputs from the user
         * */
        Scanner scanner = new Scanner(System.in);
        printLine("Please enter your yearly tuition cost: ");
        double yearlyTutionFee = getUserInputDouble(scanner);

        printLine("Please enter your annual interest rate: ");
        double annualInterestRate = getUserInputDouble(scanner);

        printLine("Please enter the number of years to repay your tuition: ");
        int numberOfYears = getUserInputInt(scanner);

        /**
         * calculate the total cost of the first year tuition,
         * with the accrued interest of the repayment plan after number of years..
         * */
        double oneYearTuitionRepaymentCost = calculateTotalTuitionCost(yearlyTutionFee, annualInterestRate, numberOfYears);
        printLine("The total cost of one year tuition, after a " + numberOfYears + "-year repayment plan is: " + oneYearTuitionRepaymentCost);

        /**
         * calculate the total cost of the four years tuition,
         * with the accrued interest of the repayment plan of those 4 years.
         */
        double fourYearTuitionRepaymentCost=calculateFourYearTutionCost(yearlyTutionFee, annualInterestRate);
        printLine("The total cost of four year tuition right after graduating is: " + fourYearTuitionRepaymentCost);
        /**
         ** calculate the total cost of the repayment plan, after graduation
         */
        fourYearTuitionRepaymentCost = calculateTotalTuitionCost(fourYearTuitionRepaymentCost, annualInterestRate, numberOfYears);
        printLine("The total cost of a four year tuition, after a " + numberOfYears + "-year repayment plan, is: " + fourYearTuitionRepaymentCost);
    }

    public static double calculateTotalTuitionCost(double tuitionFee, double annualInterestRate, double numberOfYears){
        return tuitionFee * Math.pow((1 + (annualInterestRate / 100)), numberOfYears);
    }
    public static double calculateFourYearTutionCost(double yearlyTuitionFee, double annualInterestRate){
        double previousYearInterest=0;
        double fourYearTuitionRepaymentCost=0;
        for (int i = 0; i < 4; i++) {
            /// add the total interest from the last year debt.
            previousYearInterest = (fourYearTuitionRepaymentCost * (annualInterestRate / 100));
            /// add the yearly new tuition fee.
            fourYearTuitionRepaymentCost += (yearlyTuitionFee + previousYearInterest);
        }
        return fourYearTuitionRepaymentCost;
    }

}
