import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question12 {

    public static void main(String[] args) {

        List<Integer> ll = Arrays.asList(2,1,3,4,2,3,6,7,8,6,7,8,9);

        Map<Integer, Long> m =ll.stream()
                .collect(Collectors.groupingBy(e->e, Collectors.counting()));

        m.keySet().stream().sorted();

        for( Integer tt: m.keySet())
        {
            System.out.println(tt + "    ->    " + m.get(tt));
        }
    }
}
