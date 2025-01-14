import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        //1.6 Add two integers with using Binary operator and print the result.
        BinaryOperator<Integer> addIntegers = (a, b) -> a + b;
        int result = addIntegers.apply(5, 20);
        System.out.println("Addition of 5 and 20 is: " + result);







    }

}
