import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        intStream.forEach(System.out::println);



    }
}
