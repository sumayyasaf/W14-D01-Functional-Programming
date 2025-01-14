import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
    public static void main(String[] args) {
        // lambda expression to find square of number using ToIntFunction FI
        ToIntFunction<Integer> square = x -> x * x;
        // computing Square of an Integer using Function FI
        System.out.println("Square of 5: " + square.applyAsInt(8));
        System.out.println("Square of 10: " + square.applyAsInt(5));
        System.out.println("Square of 8: " + square.applyAsInt(4));

    }
}
