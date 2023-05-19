import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {
    public static void main(String[] args)
    {
        List<Integer> ll = new ArrayList<>();
        ll = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer sum = ll.stream()
                .filter(o->o%2==0).mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }
}
