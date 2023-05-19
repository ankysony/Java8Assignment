import java.util.*;
import java.util.stream.Collectors;

public class Question7 {
    public static void main(String args[]) {

        List<String> ll = new ArrayList<>();
        ll = Arrays.asList("How are you ankit", "I am fine", "ankit is very smart", "ankit is also good at coding");

        Optional<String> cword = ll.stream()
                .flatMap(sentences -> Arrays.stream(sentences.split(" ")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);

        System.out.println(cword.get());
    }
}
