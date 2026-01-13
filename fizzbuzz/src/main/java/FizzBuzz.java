public class FizzBuzz {

    public String[] fizzBuzz(int loop) {
        String[] result = new String[loop];

        for (int i = 0; i < loop; i++) {
            int number = i + 1;

            if (number % 3 == 0 && number % 5 == 0) {
                result[i] = "Fizzbuzz";
            }
            else if (number % 3 == 0) {
                result[i] = "Fizz";
            } else if (number % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(number);
            }
        }

        return result;
    }

}
