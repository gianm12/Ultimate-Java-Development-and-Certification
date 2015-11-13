package Section6_InterfacesAndLambdaExpressions;

public abstract class Section6_31_Animal implements Section6_31_MyInterfaces{

	@Override
	public void doSomething() {
	System.out.println("im an animal");
	}
	public abstract void walk();
	
	public void eat(){
		System.out.println("eating");
	}

	
}
