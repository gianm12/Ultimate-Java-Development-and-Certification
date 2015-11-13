package Section4_OverridingMethodsPolymorphismSaticClasses;

import java.util.Date;

public class Section4_18_MethodOverrloading {
	public static void main(String[] args) {
		Date mAssignmentDate = new Date();
		Section4_18_AssignmentObject joeyAssignment = new Section4_18_AssignmentObject("Calculus Homework", "Calculus", mAssignmentDate);
		
		
		Section4_18_StudentObject joey = new Section4_18_StudentObject("Joey", "may 12, 2000", 3.4);
	
		joey.setCurrentAssignment(joeyAssignment);
		joey.setCurrentAssignment("physics project");
		
		joey.printAssignmentInfo();
		System.out.println(joey.toString());//This is called method overloading cause the function is taking in  a 
		//string and an object. Also, wecould have just done joey...
		//method overload happens at compile time.
	}

	
}
