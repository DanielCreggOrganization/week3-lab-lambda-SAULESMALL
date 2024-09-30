package ie.atu.lambda;

public class ToUpperCase implements StringOperation {
    public String apply(String input) {
        return input.toUpperCase();
    }
}
