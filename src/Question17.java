import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question17 {
    public static void main(String args[])
    {
        String ss = "ankitii";

        List<Character> ll = Arrays.asList('a','n','k','i','t','i','i');

        Map<Character,Long> m = ll.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));

        for(Character c: m.keySet()) {
            System.out.println(c + "  ->  " +m.get(c));
        }
    }
}
