package Section3_EncapsulationAndSubclassing;

public class Quiz_GovBuilding extends Quiz_BuildingObject {
	private String name;
	private boolean isTopSecret; 
	public Quiz_GovBuilding(int age, int numOfPeople, String name) {
		super(age,numOfPeople);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTopSecret() {
		return isTopSecret;
	}
	public void setTopSecret(boolean isTopSecret) {
		this.isTopSecret = isTopSecret;
	}
	
	
	
}
