import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question13 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        List<String> list2 = Arrays.asList("orange", "grape", "kiwi");
        List<String> list3 = Arrays.asList("melon", "pear", "pineapple");

        List<String> combinedList = Stream.of(list1, list2, list3)
                .flatMap(i->i.stream())
                .collect(Collectors.toList());

        System.out.println("Combined list: " + combinedList);
    }
}
