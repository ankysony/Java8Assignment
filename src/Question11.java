import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question11 {
    public static void main(String[] args) {
        List<Integer> ll = Arrays.asList(1,2,3,2,3,4,5,6,6,5,7);

        Map<Integer, Long> m = ll.stream()
                .collect(Collectors.groupingBy(a->a , Collectors.counting()));

        List<Integer> ans = new ArrayList<>();

        for(Integer t: m.keySet())
        {
            if(m.get(t) == 1)
                ans.add(t);
        }

        System.out.println(ans);

    }
}
