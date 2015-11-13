package Section5_AbstractAndNestedClasses;

public abstract class Section5_27_PersonObject {

	private String name, birthDate;
	
	public Section5_27_PersonObject(String personName, String personBirthDate)
	{
		name = personName;
		birthDate= personBirthDate;
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
