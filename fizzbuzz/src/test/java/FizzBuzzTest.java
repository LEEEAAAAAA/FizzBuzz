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



    @Test
    void fizzbuzzAsArrayTest() {
        int[] expected = {1, 2};

        int[] result = fizzBuzz.fizzBuzz(2);

        assertArrayEquals(expected, result);
    }

    @Test
    void fizzbuzzAsLoopTest() {
        int[] expected = {1, 2, 3};

        int[] result = fizzBuzz.fizzBuzz(3);

        assertArrayEquals(expected, result);
    }
       */


    @Test
    void testFizzInFizzBuzz() {
        String[] expected = {"1", "2", "Fizz"};

        String[] result = fizzBuzz.fizzBuzz(3);

        assertArrayEquals(expected, result);
    }

    @Test
    void testBuzzInFizzBuzz() {
        String[] expected = {"1", "2", "Fizz", "4" , "Buzz"};

        String[] result = fizzBuzz.fizzBuzz(5);

        assertArrayEquals(expected, result);
    }

    @Test
    void testFizzBuzzInFizzBuzz() {
        String[] expected = {"1", "2", "Fizz", "4" , "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz" };

        String[] result = fizzBuzz.fizzBuzz(15);

        assertArrayEquals(expected, result);
    }
}