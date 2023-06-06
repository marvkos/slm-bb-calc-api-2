package at.technikum.slmbbcalcapi2.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    @Test
    void addTwoPositiveIntegers() {
        // Arrange
        CalculatorController controller =
                new CalculatorController();
        int a = 5;
        int b = 6;

        // Act
        int result = controller.add(a, b);

        // Assert
        assertEquals(11, result);
    }
    @Test
    void addOnePositiveAndOneNegativeIntegers() {
        CalculatorController controller =
                new CalculatorController();
        int a = 5;
        int b = -6;

        int result = controller.add(a, b);

        assertEquals(-1, result);
    }

    @Test
    void addTwoNegativeIntegers() {
        CalculatorController controller =
                new CalculatorController();
        int a = -5;
        int b = -6;

        int result = controller.add(a, b);

        assertEquals(-11, result);
    }
}