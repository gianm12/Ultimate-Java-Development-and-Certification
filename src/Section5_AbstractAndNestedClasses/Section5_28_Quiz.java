package Section5_AbstractAndNestedClasses;

public class Section5_28_Quiz {
	public static void main(String[] args) {
		
		
		//Q1:When should you use abstract classes?
		//A1:We would use it in the class that a function in the parent class was going to be used by two or more child class
		//and if it was used, it would have to be overriden every time.
		
		/*Q2.Write a Cellphone class that has a nested class called Battery. Keep track of the
		cellphone’s name and model in the Cellphone class – both fields, along with a
		Battery object, must be passed into the Cellphone constructor. The Battery class
		simply contains one integer field, called duration, that holds the amount of time (in
		hours) the battery lasts for before it needs to be recharged.
		*/
		
		int duration =10;
		Section5_28_CellObject.Battery batteryLife = new Section5_28_CellObject.Battery(duration);
		Section5_28_CellObject cell = new Section5_28_CellObject("Samsung", "Galaxy", batteryLife);
		
		System.out.println("battery life: "+batteryLife.getDuration());
		System.out.println("name and make: "+ cell.getName()+ cell.getMake());
		
		
	}

}
