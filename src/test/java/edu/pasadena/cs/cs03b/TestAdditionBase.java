package edu.pasadena.cs.cs03b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAdditionBase {

    @Test
    public void testAdditionBase() {
        /**
         * base2 testing
         * */
        // action
        // 170 + 203 = 373
        String iResult = AdditionBase.additionBaseNo(8, 2, "10101010", "11001011");
        // assertion
        assertEquals("101110101", iResult);

        // action

        iResult = AdditionBase.additionBaseNo(8, 2, "10000001", "10010110");
        // assertion
        assertEquals("100010111", iResult);

        // 15+1 = 16
        iResult = AdditionBase.additionBaseNo(4, 2, "1111", "0001");
        // assertion
        assertEquals("10000", iResult);

        //9 + 13 = 22
        iResult = AdditionBase.additionBaseNo(4, 2, "1001", "1101");
        // assertion
        assertEquals("10110", iResult);


        /**
         * base10 testing
         * */
        iResult = AdditionBase.additionBaseNo(3, 10, "129", "150");
        assertEquals("279", iResult);

        iResult = AdditionBase.additionBaseNo(2, 10, "09", "13");
        assertEquals("22", iResult);

        iResult = AdditionBase.additionBaseNo(3, 10, "170", "203");
        assertEquals("373", iResult);

        /**
         * base16 testing
         * */
        iResult = AdditionBase.additionBaseNo(8, 16, "0xA2209ABC", "0xFFF9AECD");
        // assertion
        assertEquals("0x1A21A4989", iResult);

        iResult = AdditionBase.additionBaseNo(10, 16, "0xEF30943ABF", "0xFFCA240FFC");
        // assertion
        assertEquals("0x1EEFAB84ABB", iResult);

    }
}
