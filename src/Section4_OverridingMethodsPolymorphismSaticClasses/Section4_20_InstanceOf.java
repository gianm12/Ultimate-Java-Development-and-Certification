package Section4_OverridingMethodsPolymorphismSaticClasses;


import java.util.Calendar;
import java.util.Date;

public class Section4_20_InstanceOf {
public static void main(String[] args) {
	

	Date mAssignmentDueDate = new Date();
	Section4_20_AssignmentObject joeyAssignment = new Section4_20_AssignmentObject("Calc HW", "Calc", mAssignmentDueDate);
	Section4_20_StudentObject joey = new Section4_20_StudentObject("Joye","05/20/2000", 4.0);   
	
	
	
	
	
	
	Calendar calendar = Calendar.getInstance();
	calendar.set(Calendar.YEAR, 1980);
	calendar.set(Calendar.MONTH, Calendar.MARCH);
	calendar.set(Calendar.DATE, 23);
	
	
	Section4_20_PrincipleObject principal = new Section4_20_PrincipleObject("Alex Smith", "05/20/2000", new Date());
	Section4_20_TeacherObject sallyTeacher = new Section4_20_TeacherObject("Alexis Brown", "05/12/2000", "San Diego State", 50000, 20);
	principal.doSomething();
//	
//	doSomething(joey);
//	doSomething(principal);
//	doSomething(sallyTeacher);
//}
//	only do this if the object or library is locked (final) and we can't override functions..
//public static void doSomething(Section4_20_PersonObject person)
//{
//	if(person instanceof Section4_20_StudentObject)
//	{
//		System.out.println("This is a student object!");
//	}
//	if(person instanceof Section4_20_TeacherObject)
//	{
//		System.out.println("Its a teacher object!");
//	}
//	if(person instanceof Section4_20_PrincipleObject)
//	{
//		System.out.println("Its a principle object!!!");
//	}
	
}

}
