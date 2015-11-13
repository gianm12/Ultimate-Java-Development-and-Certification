package Section4_OverridingMethodsPolymorphismSaticClasses;

public class Section4_22_TeacherObject extends Section4_22_PersonObject{ //If we made this class final, we wouldn't be able to extend it to 
	//another object...
	private String mSchool;
	private double mBaseSalary;
	private int mNumbYearsAtSchool;
	
	public Section4_22_TeacherObject(String name, String birthDate, String school, double salary, int numYearsAtSchool)
	{
		super(name, birthDate);
		mSchool = school;
		mBaseSalary = salary;
		mNumbYearsAtSchool = numYearsAtSchool;
	}
	
	@Override
	public void printInfo(){
		System.out.println("I am a teacher and i was born on " + getBirthDate());
	}
	public final double getSalary()//the 'final' makes it so it cant be override in another class.
	{
		return  mNumbYearsAtSchool * 1000 + mBaseSalary;
	}


}
