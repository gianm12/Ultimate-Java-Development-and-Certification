package Section4_OverridingMethodsPolymorphismSaticClasses;

import java.util.Date;

public class Section4_21_StaticKeyword {

	public static void main(String[] args) {

		Section4_20_StudentObject joey = new Section4_20_StudentObject("Joey", "05/20/2000", 3.4);

		Section4_21_AssignmentObject[] assignments =
			{ new Section4_21_AssignmentObject("Bio HW"	, "Biology",new Date()),
					new Section4_21_AssignmentObject("EE hw"	, "Circuits",new Date()),
							new Section4_21_AssignmentObject("CS HW"	, "Java Class ",new Date())			
			};

//		Section4_21_AssignmentObject  assignment = new Section4_21_AssignmentObject(" " , " " , new Date());
//		
//		Section4_21_AssignmentObject farthestInPast =  assignment.getClosestAssignment(assignments);
//		instead if I use static variable in the object class, then ....
		//This way, we dont have to create an instance of the obj and just access it directly.
		Section4_21_AssignmentObject closestAssignment =   Section4_21_AssignmentObject.getClosestAssignment(assignments);
		System.out.println(closestAssignment.getmName());
	}
}
