package Section3_EncapsulationAndSubclassing;

public class Quiz_BuildingObject {
	private int age;
	private int numberOfPeople;
	private int costOfBldng;
	
	public Quiz_BuildingObject(int age, int numOfPeople)
	{
		this.age= age;
		this.numberOfPeople= numOfPeople;
	}
	public void addAge(int addedAge)
	{
		age+= 1;
		System.out.println("In the object, this is the added age." + age);
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	public int getCostOfBldng() {
		return costOfBldng;
	}
	public void setCostOfBldng(int costOfBldng) {
		this.costOfBldng = costOfBldng;
	}

}
