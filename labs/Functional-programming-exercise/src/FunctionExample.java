import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        //1.3 Print the length of the string entered using function.
        Function<String, Integer> stringLength = s -> s.length();

        int length = stringLength.apply("Function");
        System.out.println("The Length of the word 'Function' is: " + length);




    }
}
