public class IntroExceptions {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // ArithmeticException
            System.out.println("Result: " + result);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Cleanup done!");
        }
    }
}

