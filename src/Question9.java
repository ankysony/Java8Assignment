import java.util.*;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();

        ll = Arrays.asList("ankit", "is", "very", "smart", "boy");

        Optional <String> ans = ll.stream()
                .max(Comparator.comparingInt(String::length));

        System.out.println(ans);

    }
}
