package hannahmayhew.FizzBuzz2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FizzBuzzBangStream {
    public static Stream<String> create() {
        return Stream.iterate(1, n -> n + 1)
                .map(n -> convert(n));
    }

    private static String convert(int n) {
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
            return fbString;
        }
        else {
            return Integer.toString(n);
        }
    }
}
