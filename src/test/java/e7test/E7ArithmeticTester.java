package e7test;

import org.example.e7.E7ArithmeticOperations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class E7ArithmeticTester {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testArithmeticOperations() {
        E7ArithmeticOperations.main(new String[]{});
        String expectedOutput = "300" + System.lineSeparator() +
                "100" + System.lineSeparator() +
                "20000" + System.lineSeparator() +
                "2" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program declares two variables with values 200 and 100,\n" +
                "performs addition, subtraction, multiplication, and division, and prints the results on separate lines.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
