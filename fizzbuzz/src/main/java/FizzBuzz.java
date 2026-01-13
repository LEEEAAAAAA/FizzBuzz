public class FizzBuzz {

    public String[] fizzBuzz(int loop) {
        String[] result = new String[loop];

        for (int i = 0; i < loop; i++) {
            int number = i + 1;
            String value = "";

            if (number % 3 == 0){ value += "Fizz";}
            if (number % 5 == 0){ value += "Buzz";}
            if (value.isEmpty()){ value = String.valueOf(number);}

            result[i] = value;
        }

        return result;
    }

}
