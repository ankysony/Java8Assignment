import java.util.*;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String args[])
    {
        List<Integer> ll = new ArrayList<>();

        ll = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Integer maxi = ll.stream().sorted(Comparator.reverseOrder()).findFirst().get();

        System.out.println(maxi);
    }

}
