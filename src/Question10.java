import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question10 {
    public static void main(String[] args) {
        List<String> ss = Arrays.asList("ankit", "apple", "apple", "banana");

        List<String> ans = ss.stream()
                .distinct().collect(Collectors.toList());

        System.out.println(ans);
    }
}
