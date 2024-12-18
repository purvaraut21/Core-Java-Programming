
// 3. What is method overriding, and how is it used in polymorphism?
// Ans- 

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