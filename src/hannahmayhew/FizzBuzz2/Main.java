package hannahmayhew.FizzBuzz2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is the maximum number you would like to test?");
        Scanner maxNumberInput = new Scanner(System.in);
        int maxNumber = maxNumberInput.nextInt();

        for (int n = 1; n <= maxNumber; n++) {

            List<String> fb = new ArrayList<>();

            if (Arrays.asList(args).contains("3") && n % 3 == 0) {
                fb.add("Fizz");
            }
            if (Arrays.asList(args).contains("13") && n % 13 == 0) {
                fb.add("Fezz");
            }
            if (Arrays.asList(args).contains("5") && n % 5 == 0) {
                fb.add("Buzz");
            }
            if (Arrays.asList(args).contains("7") && n % 7 == 0) {
                fb.add("Bang");
            }
            if (Arrays.asList(args).contains("11") && n % 11 == 0) {
                fb.clear();
                if (n % 13 == 0) {
                    fb.add("Fezz");
                }
                fb.add("Bong");
            }
            if (Arrays.asList(args).contains("17") && n % 17 == 0) {
                Collections.reverse(fb);
            }

            if (fb.size() > 0) {
                String fbString = String.join("", fb);
                System.out.println(fbString);
            } else {
                System.out.println(n);
            }
        }
    }
}