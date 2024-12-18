

// 5. Can a subclass override a method that is declared as final in its superclass? Why or why not?
// Ans - 
//  *********** Why? ***********
// The keyword final in Java is used to indicate that a method (or a variable or class) cannot be changed or modified. 
// When a method is declared as final in a superclass, it means that the method's implementation is fixed and cannot be overridden by any subclass. 
// This is done to ensure that the behavior defined in the superclass method remains consistent and cannot be altered in subclasses.

//  *********** Key Points ***********
// final methods cannot be overridden: The primary purpose of marking a method as final is to prevent any subclass from changing its implementation. 
// This ensures that the method behaves exactly as intended by the superclass.

// Enforcing immutability: A final method may be used to implement behavior that should not be altered, ensuring the integrity and consistency of that behavior throughout the class hierarchy.
package Exercise_11;

class Animal {
    // Method marked as final
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // This will cause a compile-time error:
    // "Cannot override the final method from Animal"
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
