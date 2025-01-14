import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        //1.5 Multiply integer with 2 using Unary operator and print the result.
        UnaryOperator<Integer> multiplyByTwo = x -> x * 2;
        int result = multiplyByTwo.apply(8);
        System.out.println("The multiplication of 8*2: " + result);



    }
}
