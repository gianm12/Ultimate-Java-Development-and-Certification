 package Section4_OverridingMethodsPolymorphismSaticClasses;

import java.util.Date;

public class Section4_23_StudentObject extends Section4_22_PersonObject{

	private double  mGpa;
	private int mCurrentNumAssignments;
	private Section4_23_AssignmentObject mCurrentAssignment;
	private Section4_23_AssignmentObject[] mStudentAssignment;
	
	private int MAX_ASSIGNMENTS = 20;
	
	public Section4_23_StudentObject(String studentName, String studentBirthDate, double gpa)
	{
		super(studentName, studentBirthDate);
		mGpa= gpa; 
		mStudentAssignment = new Section4_23_AssignmentObject[MAX_ASSIGNMENTS];
	}
	
@Override //customizes the parent class
public void printInfo()
{
	System.out.println("These are the assignments that belong to user: " + getName());
//	for (Section4_23_AssignmentObject section4_23_AssignmentObject : mStudentAssignment) {
//		
//		System.out.println("Name:" +getName() + " class: " +getClass());
//		System.out.println("or... "+ section4_23_AssignmentObject.getmName());
//	}
	for (int i = 0; i < mCurrentNumAssignments; i++) {
		System.out.println("Name: " + mStudentAssignment[i].getmName());
	}
}
public void addAssignment(Section4_23_AssignmentObject assignment) {
	if(mCurrentNumAssignments < mStudentAssignment.length)
	{
		mStudentAssignment [mCurrentNumAssignments] = assignment;
		mCurrentNumAssignments++; 
	}
}

public void addAssignment(Section4_23_AssignmentObject... assignments)//varags: this is the same as writing(Section4_23_AssignmentObject[] assignments)
//varags is used when we don't know the size of the array is going to be
{
	for (Section4_23_AssignmentObject assignment : assignments) {
		addAssignment(assignment);//Method overloading....
	}
	
}

}