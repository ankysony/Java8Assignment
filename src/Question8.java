import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll= Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        List<Integer> even = ll.stream().filter(i-> i%2==0).collect(Collectors.toList());

        List<Integer> odd = ll.stream().filter(i-> i%2==1).collect(Collectors.toList());
        System.out.println(even);
        System.out.println(odd);
    }
}
