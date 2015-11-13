package Section4_OverridingMethodsPolymorphismSaticClasses;

import java.util.Date;

public class Section4_22_AssignmentObject {
	private String mName, mClassName;
	private Date mAssignmentDueDate;//lower case is cause of the instance variable
	
	public Section4_22_AssignmentObject(String name, String className, Date assignmentDueDate)
	{
		mName= name;
		mClassName = className;
		mAssignmentDueDate = assignmentDueDate;
	}
	
	public static Section4_22_AssignmentObject getClosestAssignment(Section4_22_AssignmentObject[] assignments)//making this static, it allows other 
	//classes to access the class and then the method.
	{
		long date = Long.MAX_VALUE;
		Section4_22_AssignmentObject closestAssignment = null;
		for (Section4_22_AssignmentObject assignment : assignments) 
		{
			if(assignment.mAssignmentDueDate.getTime() < date)
			{
				date= assignment.mAssignmentDueDate.getTime();
				System.out.println("hi " + date);
				closestAssignment = assignment;
			}
			
		}
		return closestAssignment;
	}
	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmClassName() {
		return mClassName;
	}

	public void setmClassName(String mClassName) {
		this.mClassName = mClassName;
	}

	public Date getmAssignmentDueDate() {
		return mAssignmentDueDate;
	}

	public void setmAssignmentDueDate(Date mAssignmentDueDate) {
		this.mAssignmentDueDate = mAssignmentDueDate;
	}
	
}
