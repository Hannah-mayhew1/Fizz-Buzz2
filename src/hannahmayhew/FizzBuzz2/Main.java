package hannahmayhew.FizzBuzz2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is the maximum number you would like to test?");
        Scanner maxNumberInput = new Scanner(System.in);
        int maxNumber = maxNumberInput.nextInt();

        for (int n = 1; n <= maxNumber; n++) {

            List<String> fb = new ArrayList<>();

            if (n % 3 == 0) {
                fb.add("Fizz");
            }
            if (n % 13 == 0) {
                fb.add("Fezz");
            }
            if (n % 5 == 0) {
                fb.add("Buzz");
            }
            if (n % 7 == 0) {
                fb.add("Bang");
            }
            if (n % 11 == 0) {
                fb.clear();
                if (n % 13 == 0) {
                    fb.add("Fezz");
                }
                fb.add("Bong");
            }
            if (n % 17 == 0) {
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