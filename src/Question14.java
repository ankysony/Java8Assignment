import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question14 {
    public static void main(String[] args) {
        List<Double> ll = new ArrayList<>();

        ll = Arrays.asList(2.3,4.5,6.0,5.7);

        Double avg = ll.stream()
                .collect(Collectors.averagingDouble(Double::doubleValue));

        System.out.println(avg);
    }
}
