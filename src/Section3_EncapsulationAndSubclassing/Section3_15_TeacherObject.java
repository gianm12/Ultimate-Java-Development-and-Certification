package Section3_EncapsulationAndSubclassing;

public class Section3_15_TeacherObject extends Section3_15_PersonObject{
	private String mSchool;
	private double mSalary;
	
	
	public Section3_15_TeacherObject(String name, String birthDate, String school, double salary)
	{
		super(name, birthDate);
		mSchool = school;
		mSalary = salary;
		
	}
	@Override
	public void printInfo(){
		System.out.println("I am a teacher and i was born on " + getBirthDate());
	}

}
