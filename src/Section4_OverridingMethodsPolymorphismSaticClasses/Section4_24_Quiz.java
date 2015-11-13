package Section4_OverridingMethodsPolymorphismSaticClasses;

public class Section4_24_Quiz {
	public static void main(String[] args) {
		System.out.println("Quiz 4");
		
		//Q1:Why is method overloading useful
		//A1: We can use the same same name for two different functions that pass different parameters. 
		
		//Q2:Why does the static keyword exist? What does it let us do that would otherwise be difficult? When should use it?
		//A2.A: It exists to be used as a global parameter and not have to declare each time(Last the whole lifecycle of the program.
		//A2.B: We can access functions inside the class from another class with out having to create an instance of the object and passing variables. 
		//A.C:We should use it when we want to access the variable or class in multiple areas and times.
		
		//Q3. Why should you avoid using the instanceof operator?
		//A3. Because it slows down the program and if the object is changed in another class it would mess it up.
		
		//Q4. Can you subclass a class that is declared final?
		//A4. No
		
		//Q5. Write a method using syntax that returns the average of a list of doubles.
		//A5.
		
		Double average =listOfDoubles(1.2,2.1,2.4);
		
		System.out.println("The list is: " + average);
	}
	public static double listOfDoubles(Double... numbers)
	{
		double newNumber;
		double addedNumbers = 0.0;
		for (int i = 0; i < numbers.length; i++) {
			
			 newNumber = numbers[i];
			 addedNumbers+=newNumber;
		}
		double average = addedNumbers/numbers.length;
		return average;
	}


}
