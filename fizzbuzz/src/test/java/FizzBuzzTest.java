import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

@BeforeEach
void setUp() {
    fizzBuzz = new FizzBuzz();
}
    /*
    @Test
    void fizzBuzz() {
        int expected = 1;

        int result = fizzBuzz.fizzBuzz();
        assertEquals(expected, result);
    }

    */


    @Test
    void fizzbuzzAsArrayTest() {
        int[] expected = {1, 2};

        int[] result = fizzBuzz.fizzBuzz();

        assertArrayEquals(expected, result);
    }
}