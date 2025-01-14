import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(10);
        System.out.println(optional.get());
    }

}
