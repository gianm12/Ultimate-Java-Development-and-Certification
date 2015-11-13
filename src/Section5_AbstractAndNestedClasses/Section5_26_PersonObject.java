package Section5_AbstractAndNestedClasses;

public abstract class Section5_26_PersonObject {

	private String name, birthDate;
	
	public Section5_26_PersonObject(String personName, String personBirthDate)
	{
		name = personName;
		birthDate= personBirthDate;
	}
	public abstract void printInfo();//We use this if we know that other class will use this method. Those classes must
	//over ride this method.
	

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
