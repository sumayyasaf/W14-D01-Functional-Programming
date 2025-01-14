import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        //Use Biconsumer to create a variable to add two integers and print the element.
        BiConsumer<Integer, Integer> addIntegers = (a, b) -> System.out.println("Addition: " + (a + b));
        addIntegers.accept(5, 6);



    }
}
