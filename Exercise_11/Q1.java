

// 1. What is polymorphism in object-oriented programming?

// Ans- 
// 		*********************** Definition ***********************
//		1- Polymorphism is an important concept of object-oriented programming.
//			It refers to the ability of one thing to many distinct form.
//		2- It describes the ability of something to have or to be displayed in more than one form.
//		3- Example- A person can have different characteristics at the same time,
//			which is an example of polymorphism in real life.
//		4- In OOPs- Polymorphism is a key concept in object-oriented programming(OOP).
//			A common use of Polymorphism in OOP is when a parent class reference is used to refer to a child class object.
//		5- In Java- A Java object that can pass more than one is.A test is considered to be polymorphic.
// 		6- The word 'Poly' means many and 'morphs' means form,so it means many forms.

// 	    *********************** Types of Polymorphism 	***********************
// 		1- Compile-Time Polymorphism.
// 		2- Run-Time Polymorphism.

// 		1- Compile-Time Polymorphism :-
// 		1) Compile-Time Polymorphism is also known as Static Binding(early binding).
// 		2) It can be achieved by using method overloading.
// 		3) Static Binding means that the code associated with the method call is linked at compile time.
// 		4) Benefits- 1) Code Reusability 
//					 2) Flexibility
// 					 3) Improved Readability.
// 		5) Example- 
//				 class Dog {
//					 void eat()
//					 {
//						 System.out.println("The Dog eats Biscuits");
//					 }
//				 }
//					 public class Q1 {
//							public static void main(String[] args) {
//								Dog d1 = new Dog();
//								d1.eat();
//
//							}
//					 }
		
//      *********************** Method Overloading ***********************	
					 
//		1) Method Overloading refers to defining multiple method in the same class
//		   with same name but with different parameters.
// 		2) Method Overloading increases the readability of the program.
// 		3) Different way of Method Overloading in Java
// 		i)  Changing the no of Parameter
// 		ii) Changing Data type of arguments.
// 		Example- 
				package Exercise_11;

				// Class to demonstrate method overloading
				class Sum {
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
					Sum s = new Sum();
        
				// Calling the sum method with two arguments
					System.out.println(s.sum(10, 20));  // Output: 30
        
               // Calling the sum method with three arguments
					System.out.println(s.sum(10, 20, 30));  // Output: 60
					}
				}

			 // Class to demonstrate array initialization and iteration
				public class Q1 {
					public static void main(String[] args) {
			// Declare, creation, and initialization an integer array
				int[] myArray = {10, 20, 30};
        
           // Accessing and printing array elements
              for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + ": " + myArray[i]);
        }
    }
}
				
// 		1- Run-Time Polymorphism :-
// 		1) It is also known as Dynamic method dispatch
// 		2) It can be achieved by using Method Overriding.
//      3) Dynamic binding means that the code associated with the method call is linked at run time.
//      4) Dynamic binding also known as late binding.
				
//                   			OR
// 		5) It is a process in which a call to an overridden method is resolved
//         at run time rather than compile-time.

//		 *********************** Method Overriding ***********************	
				 
//		  1) Method Overriding occur when a subclass provides a specific implementation of a method that is already defined in its superclass.
//		  2) The Method in the subclass must have the same signature (name & parameter) as the method in the superclass.
//		  i)   Over and Access Modifiers
//		  ii)  final method can not be overridden
//		  iii) Static method can not be overridden.	
				
// Implementation:-
//				class Student {
//					void display()
//					{
//					  System.out.println("I am Student");
//					}
//				}
//				class Studentbranch extends  Student {
//					void display()
//					{
//						System.out.println("I am computer engineer student");
//					}
//				}
//				public class C_methodOverriding {
//					public static void main(String[] args) {
//						Studentbranch s1 = new Studentbranch();
//						s1.display();
//					}
//					
//				}
					 
		



