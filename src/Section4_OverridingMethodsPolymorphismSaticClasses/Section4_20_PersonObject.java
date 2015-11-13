package Section4_OverridingMethodsPolymorphismSaticClasses;

public class Section4_20_PersonObject {

	private String name, birthDate;
	
	public Section4_20_PersonObject(String personName, String personBirthDate)
	{
		name = personName;
		birthDate= personBirthDate;
	}
	public void printInfo()
	{
		System.out.println("I am a person" + " and my birth date is:  " + birthDate);
	}
	public void doSomething()
	{
		System.out.println("this should never run unless its a person obj!");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}
