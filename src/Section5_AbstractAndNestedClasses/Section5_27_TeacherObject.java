package Section5_AbstractAndNestedClasses;

public class Section5_27_TeacherObject extends Section5_27_PersonObject{ //If we made this class final, we wouldn't be able to extend it to 
	//another object...
	private String mSchool;
	private double mBaseSalary;
	private int mNumbYearsAtSchool;
	private Subject subject;
	
	public Section5_27_TeacherObject(String name, String birthDate, String school, double salary, int numYearsAtSchool)
	{
		super(name, birthDate);
		mSchool = school;
		mBaseSalary = salary;
		mNumbYearsAtSchool = numYearsAtSchool;
	}
	public void setSubject(Subject subject)
	{
		this.subject= subject;
	}
	public Subject getSubject()
	{
		return this.subject;
	}
	
	public static class Subject
	{
		private String subjectName;
		public Subject(String subject)
		{
			this.subjectName = subject;
		}
		public void setSubjectName(String subjectName)
		{
			this.subjectName= subjectName;
		}
		public String getSubjectName()
		{
			return this.subjectName;
		}
	}



}
