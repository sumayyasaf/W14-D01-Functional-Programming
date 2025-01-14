import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {
    public static void main(String[] args) {
        ToDoubleFunction<Integer> subtractConstant = x -> x - 5.0;

        System.out.println("10 - 5.0 = " + subtractConstant.applyAsDouble(10));
        System.out.println("20 - 5.0 = " + subtractConstant.applyAsDouble(20));
        System.out.println("50 - 5.0 = " + subtractConstant.applyAsDouble(50));
    }
    }





