package Section4_OverridingMethodsPolymorphismSaticClasses;

import java.util.Date;

public class Section4_18_AssignmentObject {
	private String mName, mClassName;
	private Date mAssignmentDueDate;//lower case is cause of the instance variable
	
	public Section4_18_AssignmentObject(String name, String className, Date assignmentDueDate)
	{
		mName= name;
		mClassName = className;
		mAssignmentDueDate = assignmentDueDate;
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
