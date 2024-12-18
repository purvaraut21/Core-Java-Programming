
// 2. What is method overloading, and how is it used in polymorphism?
// Ans-      
// 			*********************** Method Overloading ***********************	

//			1) Method Overloading refers to defining multiple method in the same class
//			   with same name but with different parameters.
//			2) Method Overloading increases the readability of the program.
//			3) Different way of Method Overloading in Java
//				i)  Changing the no of Parameter
//				ii) Changing Data type of arguments.
//			Example- 
			package Exercise_11;

			// Class to demonstrate method overloading
			class Sum1 {
			// Method to sum two integers
			public int sum(int x, int y) {
				return x + y;
			}

			// Method to sum three integers
			public int sum(int x, int y, int z) {
				return x + y + z;
			}

			public static void main(String[] args) {
			// Creating an instance of Sum to call sum() methods
				Sum1 s = new Sum1();

			// Calling the sum method with two arguments
				System.out.println(s.sum(10, 20));  // Output: 30

			// Calling the sum method with three arguments
				System.out.println(s.sum(10, 20, 30));  // Output: 60
				}
			}

			// Class to demonstrate array initialization and iteration
				public class Q2 {
					public static void main(String[] args) {
			// Declare, creation, and initialization an integer array
				int[] myArray = {10, 20, 30};

			// Accessing and printing array elements
				for (int i = 0; i < myArray.length; i++) {
					System.out.println("Element " + i + ": " + myArray[i]);
						 }
					   }
                   }

