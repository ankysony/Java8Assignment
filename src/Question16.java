import java.util.Arrays;
import java.util.List;

public class Question16 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 9, 11);

        boolean allPrimes = numbers.stream()
                .allMatch(Question16::isPrime);

        if (allPrimes) {
            System.out.println("The list contains only prime numbers.");
        } else {
            System.out.println("The list contains at least one non-prime number.");
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
