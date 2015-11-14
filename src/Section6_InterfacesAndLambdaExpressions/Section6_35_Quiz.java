package Section6_InterfacesAndLambdaExpressions;

public class Section6_35_Quiz {
	public static void main(String[] args) {
		/*
		 * Q1. Explain the difference between an interface and abstract class along with when you should use an abstract class
		 *  and when you should use an interface.
		 *  A1. All the methods in the interface need to be abstract. While the abstract class doesn't have to have all abstract methods.
		 *  The interface class is used and meant to be more generic. You should use abstract as you should with hierarchical methodology.


			Q2. Why are anonymous inner classes useful? How do they work?
			A2.Because we don't have to create a whole sub-class in order to use an interface.
			They work by overwriting an interface and overriding the methods.

			3. Why is the default keyword useful?
			A3.It is useful in the case that we don't always want to override the function. The interface class can have
			that and only be overridden when needed (since in interface classes we have to override every function).


			Q4. What are lambda expressions? Why are they useful? What is the relationship
			between a lambda expression and an anonymous inner class?
			A4. Lambda expression looks at the abstract method of an interface (the interface must only have one abstract method), then it 
			overrides that function. They are useful in multi-thread coding. Lambda expressions are a shortcut to using anonymous classes. 
		 */
		/*Answer key:
		 * 
			1.Methods in interfaces can have no implementations whatsoever, whereas
			abstract classes let you mix abstract methods and non-abstract methods. You can
			implement multiple interfaces, but you can only subclass one class. Interfaces,
			then, should be used when you’re representing behavior that can be applied to
			many different kinds of classes (a move() method in an interface, for example,
			could apply to people, animals, or machines), while abstract classes should be used
			when you need subclasses to provide implementations (an operate() method in an
			abstract base class called Robot, for example, should be implemented in a
			DiggerRobot or DrillerRobot, but it doesn’t make sense to put this operate method
			in an interface because it only applies to robots, not people or animals).
			
			
			2.Anonymous inner classes are useful because they let you create a subclass of
			an abstract class or interface without having to actually create a new class. This
			makes your code cleaner and easier to read.
			
			3.If you define an interface, then classes that implement it need to provide
			implementations for every method in it. If your class is used throughout your
			program many times, then if you add a new method to the interface, every
			implementer will have to add that method. By adding the default keyword, you can
			provide a default implementation for the new method instead so that implementers
			don’t have to provide an implementation for the new method
			
			
			4.Lambda expressions are just wrappers around anonymous inner classes (you
			can prove this to yourself by replacing a lambda expression with an anonymous
			inner class; your program will compile just fine). They make your code cleaner and
			easier to read.
		 * 
		 */
	}

}
