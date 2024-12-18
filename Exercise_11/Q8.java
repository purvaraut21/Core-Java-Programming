

// 8. How does polymorphism enable code reuse in object-oriented programming?
// Ans-
//  Polymorphism is a core concept in object-oriented programming 
//  (OOP) that allows objects of different types to be treated as 
//   objects of a common superclass. It enables code reuse by allowing 
//   you to write more general, flexible, and maintainable code, while 
//   still supporting specific behaviors of derived classes. 
//   Polymorphism is primarily achieved through method 
//   overriding (runtime polymorphism) and method overloading (compile-time polymorphism).
//  ********* Reuse of Common Interfaces *********
//  Polymorphism allows you to define a common interface or abstract class with methods 
//  that are implemented by different subclasses. Once you define these methods in a 
//  superclass (or interface), you can reuse them across multiple subclasses without 
//  needing to rewrite the same code in each subclass.

//  For example, you can define a method in an interface or abstract class 
//  and implement it in multiple subclasses. The client code that uses the 
//  interface doesn’t need to know the specifics of the subclass but can 
//  still call the same method on any object that implements the interface.
// Example :-
// interface Shape {
//    void draw(); // Common method to all shapes
//}

//class Circle implements Shape {
//    public void draw() {
//        System.out.println("Drawing Circle");
//    }
//}
//
//class Rectangle implements Shape {
//    public void draw() {
//        System.out.println("Drawing Rectangle");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Shape shape1 = new Circle();
//        Shape shape2 = new Rectangle();
//        
//        // Same method is reused across different shapes
//        shape1.draw();  // Output: Drawing Circle
//        shape2.draw();  // Output: Drawing Rectangle
//    }
//}
package Exercise_11;
class Zoo {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogs extends Zoo {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Zoo {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Q8 {
    // This method works with any type of Animal
    public static void makeSound(Zoo zoo) {
        zoo.sound();  // Polymorphism: Animal's sound method is dynamically dispatched
    }

    public static void main(String[] args) {
    	Zoo myDog = new Dogs();
    	Zoo myCat = new Cat();
        
        makeSound(myDog); // Output: Dog barks
        makeSound(myCat); // Output: Cat meows
    }
}
