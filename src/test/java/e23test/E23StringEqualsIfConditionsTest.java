package e23test;

import org.example.e23.E23StringEqualsIfConditions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E23StringEqualsIfConditionsTest {

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
    void testStringEquals() {
        // Simulate the program with the string "Java"
        E23StringEqualsIfConditions.main(new String[]{});
        String expectedOutput = "The programming language is Java." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program correctly identifies the string 'Java'.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
