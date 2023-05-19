import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question18 {
    public static List<Character> convertStringToCharList(String str)
    {

        // Create an empty List of character
        List<Character> chars = new ArrayList<>();

        // For each character in the String
        // add it to the List
        for (char ch : str.toCharArray()) {

            chars.add(ch);
        }

        // return the List
        return chars;
    }
    public static void main(String args[])
    {
        String ss = "ankitii";

        List<Character> ll = convertStringToCharList(ss);

        Character m = ll.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get();

        System.out.println(m);

    }
}
