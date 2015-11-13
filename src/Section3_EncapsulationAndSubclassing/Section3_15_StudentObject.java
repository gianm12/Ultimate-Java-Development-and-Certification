package Section3_EncapsulationAndSubclassing;
/*
public class Section3_14_StudentObject {
	
	private String name, birthDate;
	
	public Section3_14_StudentObject(String studentName, String studentBirthDate)
	{
		name= studentName;
		birthDate = studentBirthDate;
	}
	
	public void printInfo()
	{
		System.out.println("I am a student and I was born on " + birthDate);
	}

}
*/
public class Section3_15_StudentObject extends Section3_15_PersonObject{
	private String mGpa;
	public Section3_15_StudentObject(String studentName, String studentBirthDate, String gpa)
	{
		super(studentName, studentBirthDate);
		mGpa= gpa;
	}
	
@Override //customizes the parent class
public void printInfo()
{
	System.out.println("See? im in the student class");
	
}
	
	
	
	
}