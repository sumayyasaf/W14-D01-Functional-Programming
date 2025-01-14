import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        // 1.4  takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> addIntegers = (a, b) -> a + b;
        int result = addIntegers.apply(20, 40);
        System.out.println("Sum of Integers: " + result);

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> addAndReturnList = (a, b) -> {
            List<Integer> list = new ArrayList<>();
            list.add(a + b);
            return list;
        };
        List<Integer> listResult = addAndReturnList.apply(20, 40);
        System.out.println("Sum of List: " + listResult);


    }
}
