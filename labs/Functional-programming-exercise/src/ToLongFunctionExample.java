import java.util.function.ToLongFunction;

public class ToLongFunctionExample {
    public static void main(String[] args) {

        // lambda expression to multiply number with 1024 using ToLongFunction FI
        ToLongFunction<Integer> multiplyBy1024 = x -> x * 1024;
        // multiply below number using above ToLongFunction FI
        System.out.println("5 multiplied by 1024: " + multiplyBy1024.applyAsLong(5));
        System.out.println("10 multiplied by 1024: " + multiplyBy1024.applyAsLong(10));
        System.out.println("50 multiplied by 1024: " + multiplyBy1024.applyAsLong(50));
    }
    }

