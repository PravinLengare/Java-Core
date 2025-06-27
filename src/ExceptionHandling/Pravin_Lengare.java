package ExceptionHandling;

// Custom exception class
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class Pravin_Lengare {
    // Static method to calculate area
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    // Static method to divide two numbers
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            // Attempt division (will throw ArithmeticException)
            int c = divide(2, 0);
            System.out.println("Division result: " + c);

            // Calculate area
            double k = area(6); // Positive radius
            System.out.println("Area: " + k);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: Division by zero is not allowed.");
        }
        catch (NegativeRadiusException e) {
            System.out.println("NegativeRadiusException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred.");
            System.out.println(e);
        }
    }
}
