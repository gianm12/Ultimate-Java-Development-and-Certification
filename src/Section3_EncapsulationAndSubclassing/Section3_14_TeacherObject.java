package Section3_EncapsulationAndSubclassing;


public class Section3_14_TeacherObject {
	private String name, birthDate;
	public Section3_14_TeacherObject(String mName, String mBirthDate)
	{
		name = mName;
		birthDate = mBirthDate;
	}
	
	public void printInfo(){
		System.out.println("I am all mighty teacher!");
		System.out.println("Im a teacher and I was born on  "+ birthDate);
	}
	

}
