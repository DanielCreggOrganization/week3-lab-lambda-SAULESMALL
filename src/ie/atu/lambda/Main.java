package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3));

        StringOperation toUpper = (input) -> input.toUpperCase();
        System.out.println("Uppercase: " + toUpper.apply("Saule"));

        Runnable task = () -> System.out.println("Hello from the thred");
        Thread thread = new Thread(task);
        thread.start();

        Calculator square = (x) -> x * x;
        int result = square.calculate(5);
        System.out.println("Square of 5 is: " + result);

        Function<String, String> trim = s -> s.trim();
        Function<String, String> replaceSpaces = s -> 
        s.replace(" ", "-");
        Function<String, String> toLowerCase = s -> 
        s.toLowerCase();

        Function<String, String> combinedOperation = trim.andThen(replaceSpaces).andThen(toLowerCase);

        String result2 = combinedOperation.apply("   Hello World From Lambda   ");
        System.out.println("Result: " + result2);
    }
}
