package hannahmayhew.FizzBuzz2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        FizzBuzzBangStream.create().limit(200).forEach(System.out::println);
    }
}