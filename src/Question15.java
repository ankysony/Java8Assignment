import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question15 {
    public static void main(String args[])
    {
        List<Integer> ll = Arrays.asList(1,2,3,6,5,4,7,8,9,6,54,78);

        Integer ans = ll.stream()
                .sorted(Comparator.comparing(Integer::intValue)).skip(1).findFirst().get();

        System.out.println(ans);
    }
}
