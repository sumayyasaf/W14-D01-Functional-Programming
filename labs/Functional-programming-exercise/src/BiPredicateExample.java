import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        // 1.2 -Compare Two Integer Numbers Using BiPredicate
        BiPredicate<Integer, Integer> compareIntegers = (a, b) -> a > b;
        boolean result = compareIntegers.test(50,200);
        System.out.println("Is 50 greater than 200: " + result);





    }
}
