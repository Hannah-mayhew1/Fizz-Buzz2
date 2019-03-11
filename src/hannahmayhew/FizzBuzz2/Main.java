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


        for (int n = 1; n <= maxNumber ; n++) {

            boolean Fizz = false;
            boolean Buzz = false;
            boolean Bang = false;
            boolean Bong = false;
            boolean Fezz = false;
            boolean Reverse = false;

            List<String> FB = new ArrayList<>();

            if (n % 3 == 0) {
                Fizz = true;
                FB.add("Fizz");
            }
            if (n % 13 == 0) {
                Fezz = true;
                FB.add("Fezz");
            }
            if (n % 5 == 0) {
                Buzz = true;
                FB.add("Buzz");
            }
            if (n % 7 == 0) {
                Bang = true;
                FB.add("Bang");
            }
            if (n % 11 == 0) {
                Bong = true;
                FB.clear();
                if (Fezz) {
                    FB.add("Fezz");
                }
                FB.add("Bong");
            }
            if (n % 17 == 0) {
                Reverse = true;
                Collections.reverse(FB);
            }

            if (FB.size() > 0) {
                String fbString = String.join("", FB);
                System.out.println(fbString);
            }
            else {
                System.out.println(n);
            }
        }
    }
}
