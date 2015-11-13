 package Section4_OverridingMethodsPolymorphismSaticClasses;

import java.util.Date;

public class Section4_20_StudentObject extends Section4_20_PersonObject{

	private double  mGpa;
	private Section4_20_AssignmentObject mCurrentAssignment;
	private Section4_20_AssignmentObject[] mStudentAssignment;
	int MAX_ASSIGNMENTS = 5;
	
	public Section4_20_StudentObject(String studentName, String studentBirthDate, double gpa)
	{
		super(studentName, studentBirthDate);
		mGpa= gpa;
		mStudentAssignment = new Section4_20_AssignmentObject[MAX_ASSIGNMENTS];
	}
	
@Override //customizes the parent class
public void printInfo()
{
	System.out.println("See? im in the student class");
	 
}

public void printAssignmentInfo()
{
	if(mCurrentAssignment !=null)
	{	
		System.out.println(mCurrentAssignment.getmName()+ ", "+ mCurrentAssignment.getmAssignmentDueDate() );
	}
}

@Override
public String toString()
{
	return "this is the toString in student object: "+ getName() + " " + mGpa + " " + mCurrentAssignment.getmName()+" "+ mCurrentAssignment.getmClassName();
}
//
//public void addAssignment(Section4_20_AssignmentObject assignment)
//{
//	if(mCurrentAssignment < MAX_ASSIGNMENTS)
//	{
//		mStudentAssignment[mCurrentAssignment] = assignment;
//		mCurrentAssignment++;
//	}
//	
//}


public void setCurrentAssignment(Section4_20_AssignmentObject assignment)
{
	mCurrentAssignment= assignment;
	
}
public void setCurrentAssignment(String assignmentName)
{
	mCurrentAssignment= new Section4_20_AssignmentObject(assignmentName, "Physics", new Date());
}
}
