package Section3_EncapsulationAndSubclassing;

public class Section3_13_Object {
	private String username, password;
	private int userAge;
	private double money;
	
	public Section3_13_Object(String name, String pass, int age)
	{
		username = name;
		password = pass;
		userAge = age;
	}
	public void addMoney(double newMoney, String pass)
	{
		if(pass.equals(password))
		{
			money+= newMoney;
		}
		else
		{
			System.out.println("Incorrect password!");
		}
	}
	
	
	public void setMoney(double newAMount, String pass)
	{
		if(pass.equals(password)){
		money = newAMount;
		}
		else{
			System.out.println("Your password is incorrect!");
		}
	}
	public double getMoney()
	{
		return money;
	}
	
	

}
