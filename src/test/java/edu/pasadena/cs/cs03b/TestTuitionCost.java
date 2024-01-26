package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTuitionCost {

    @Test
    public void testTuitionCost()
    {
        // action
        double iResult = TuitionCostPredictor.calculateTotalTuitionCost(10000, 5, 10);
        // assertion
        assertEquals(16289, (double)Math.round(iResult));


        // action
        iResult = TuitionCostPredictor.calculateFourYearTutionCost(10000, 5);
        // assertion
        assertEquals(43101, (double)Math.round(iResult));

        // action
        iResult = TuitionCostPredictor.calculateTotalTuitionCost(43101, 5,10);
        // assertion
        assertEquals(70207, (double)Math.round(iResult));

    }
}
