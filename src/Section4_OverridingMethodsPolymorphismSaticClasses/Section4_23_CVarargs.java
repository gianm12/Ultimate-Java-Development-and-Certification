package Section4_OverridingMethodsPolymorphismSaticClasses;

import java.util.Date;

public class Section4_23_CVarargs {
	public static void main(String[] args) {
	
		 Section4_23_AssignmentObject joeyAssignment = new Section4_23_AssignmentObject("Calc hw", "calc", new Date());
		 Section4_23_StudentObject joey = new Section4_23_StudentObject("joey", "3/2/10", 3.4);
		 
		 joey.addAssignment(new Section4_23_AssignmentObject("cs lab", "cs", new Date()));
		 joey.addAssignment(new Section4_23_AssignmentObject("EE lab", "EE", new Date()));
		 joey.addAssignment(new Section4_23_AssignmentObject("Physics lab", "Physics", new Date()));
		 joey.printInfo(); 
		 //or....
		 joey.addAssignment(new Section4_23_AssignmentObject("cs lab", "cs", new Date()),
				 new Section4_23_AssignmentObject("EE lab", "EE", new Date()),
			    new Section4_23_AssignmentObject("Math hw", "Physics", new Date()));
		joey.printInfo();
	}

}
