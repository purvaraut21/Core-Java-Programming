

// 6. Can a subclass overload a method that is declared in its superclass? Why or why not?
// Ans-
// *********** Why? ***********
// Method overloading occurs when you define multiple methods with the same name but with different parameter lists (i.e., different number or types of parameters) in the same class or in a subclass. Overloading is different from method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass, with the exact same method signature.

// In the case of method overloading in a subclass, the subclass can define a method with the same name as a method in the superclass, but with a different parameter signature (i.e., different types or number of parameters).

// This is allowed because overloading is based on the method signature (which includes the method name and parameter types), and overriding is based on the exact method signature (name and parameters). Overloading doesn’t replace the superclass method, but introduces additional methods with the same name and different parameters.

//      *********************** Method Overloading ***********************	
					 
//		1) Method Overloading refers to defining multiple method in the same class
//		   with same name but with different parameters.
// 		2) Method Overloading increases the readability of the program.
// 		3) Different way of Method Overloading in Java
// 		i)  Changing the no of Parameter
// 		ii) Changing Data type of arguments.
// 		Example- 
//				package Exercise_11;
//
//				// Class to demonstrate method overloading
//				class Sum2 {
//				// Method to sum two integers
//				public int sum(int x, int y) {
//				 return x + y;
//				}
//
//				// Method to sum three integers
//				public int sum(int x, int y, int z) {
//					return x + y + z;
//				}
//
//				public static void main(String[] args) {
//				// Creating an instance of Sum to call sum() methods
//					Sum2 s = new Sum2();
//        
//				// Calling the sum method with two arguments
//					System.out.println(s.sum(10, 20));  // Output: 30
//        
//               // Calling the sum method with three arguments
//					System.out.println(s.sum(10, 20, 30));  // Output: 60
//					}
//				}
//
//			 // Class to demonstrate array initialization and iteration
//				public class Q6 {
//					public static void main(String[] args) {
//			// Declare, creation, and initialization an integer array
//				int[] myArray = {10, 20, 30};
//        
//           // Accessing and printing array elements
//              for (int i = 0; i < myArray.length; i++) {
//            System.out.println("Element " + i + ": " + myArray[i]);
//        }
//    }
//}

// Example:-
package Exercise_11;
class Animals {
    // Method in the superclass
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Doggy extends Animal {
    // Overloading the makeSound method in the subclass
    public void makeSound(String sound) {
        System.out.println("Dog barks: " + sound);
    }

    public void makeSound(int times) {
        System.out.println("Dog barks " + times + " times");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Doggy dog = new Doggy();

        // Calling overloaded methods
        dog.makeSound("Animal makes a sound");              // Output: Animal makes a sound (inherited from Animal)
        dog.makeSound("Woof!");       						// Output: Dog barks: Woof!
        dog.makeSound(3);             						// Output: Dog barks 3 times
    }
}

