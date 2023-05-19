import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "World", "Stream", "API");

        String concatenatedString = stringList.stream()
                .collect(Collectors.joining());

        System.out.println(concatenatedString);
    }
}
