import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String args[])
    {
        List<String> words = new ArrayList<>();
        words = Arrays.asList("Ankit", "is" , "very", "good", "with", "coding");

        List<String> ans = words.stream()
                .filter(s-> s.charAt(0)=='A').collect(Collectors.toList());
        System.out.println(ans);

    }
}
