

// 9. Can a class have multiple methods with the same name, but with different return types? Why or why not?
// Ans- 
// No, a class cannot have multiple methods with the same name but different return types alone. 
// This is because method overloading in Java is determined by the method signature, and the method 
// signature includes the method name and the parameter list, but not the return type.

// Why Can't You Overload by Return Type Only?
// The method signature in Java includes:
// 1.Method name
// 2.Parameter types (number and order)
// The return type is not part of the method signature and does not affect the overloading rules. 
// Therefore, you cannot overload a method based solely on having different return types.

package Exercise_11;
class Example {
    // Method 1: Takes two int parameters
    public int calculate(int a, int b) {
        return a + b;
    }

    // Method 2: Takes two double parameters
    public double calculate(double a, double b) {
        return a + b;
    }

    // Method 3: Takes one int and one double parameter
    public double calculate(int a, double b) {
        return a + b;
    }
}

public class Q9 {
    public static void main(String[] args) {
        Example example = new Example();

        // Calling the overloaded methods
        System.out.println(example.calculate(3, 5));       // Calls int version, output: 8
        System.out.println(example.calculate(3.5, 5.5));   // Calls double version, output: 9.0
        System.out.println(example.calculate(3, 5.5));     // Calls mixed version, output: 8.5
    }
}

