

// 4. What is dynamic method dispatch, and how is it used in polymorphism?
// Ans-
// *********************** Dynamic method dispatch *********************** 
//          It is a mechanism in Java (and many other object-oriented languages) that allows 
//			the method that is invoked to be determined at runtime, rather than at compile-time. 
//			This enables polymorphism in Java, where a subclass method can be called even when 
//          the object is referred to by a superclass reference.
//			This technique is crucial in achieving runtime polymorphism, 
//			where the method that gets executed is determined by the actual 
//			object type (not the reference type) at runtime.
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
//				public class Q4 {
//					public static void main(String[] args) {
//						Studentbranch s1 = new Studentbranch();
//						s1.display();
//					}
//					
//				}

