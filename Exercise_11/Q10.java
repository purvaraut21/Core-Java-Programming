

// 10. How does dynamic method dispatch enable more flexibility in object-oriented programming?
// Ans-
// Dynamic method dispatch is a core feature of polymorphism in object-oriented programming (OOP). 
// It refers to the process where Java (or any object-oriented language) determines at runtime which 
// method to call based on the actual object type, rather than the reference type. This dynamic selection 
// of methods allows for more flexibility, extensibility, and maintainability in object-oriented systems.
// ********** Key Concepts of Dynamic Method Dispatch **********
// Polymorphism: It is the ability of different objects to respond to the same method in different ways. 
// With dynamic method dispatch, Java selects the appropriate method from the class that corresponds to
// the object type, not the reference type.

// Method Overriding: Dynamic dispatch works when a subclass overrides a method of the superclass. 
// At runtime, Java calls the overridden method in the subclass, even if the reference is of the superclass type.

// Run-time Binding: The selection of the method to be executed is determined during runtime rather than compile-time. 
// This means the actual method to be called depends on the object that is being referred to, not on the reference type.
// How Dynamic Method Dispatch Works
// Here’s how it works:

// You create a superclass with a method that can be overridden in a subclass.
// When an object of the subclass is referred to by a variable of the superclass type,
// the method call is resolved dynamically at runtime based on the actual class of the object, 
// not the type of the reference.
// Example -
package Exercise_11;
class Animals1 {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Doggy1 extends Animals1 {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cats extends Animals1 {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Q10 {
    public static void main(String[] args) {
    	Animals1 myAnimal = new Animals1(); // Animal reference and object
    	Animals1 myDog = new Doggy1();        // Animal reference but Dog object
    	Animals1 myCat = new Cats();        // Animal reference but Cat object

        myAnimal.sound(); // Output: Animal makes a sound
        myDog.sound();    // Output: Dog barks (dynamic method dispatch)
        myCat.sound();    // Output: Cat meows (dynamic method dispatch)
    }
}

