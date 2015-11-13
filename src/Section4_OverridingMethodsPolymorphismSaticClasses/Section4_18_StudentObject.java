package Section4_OverridingMethodsPolymorphismSaticClasses;

import java.util.Date;

public class Section4_18_StudentObject extends Section4_18_PersonObject{

	private double  mGpa;
	private Section4_18_AssignmentObject mCurrentAssignment;
	public Section4_18_StudentObject(String studentName, String studentBirthDate, double gpa)
	{
		super(studentName, studentBirthDate);
		mGpa= gpa;
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

public void setCurrentAssignment(Section4_18_AssignmentObject assignment)
{
	mCurrentAssignment= assignment;
	
}
public void setCurrentAssignment(String assignmentName)
{
	mCurrentAssignment= new Section4_18_AssignmentObject(assignmentName, "Physics", new Date());
}
}
