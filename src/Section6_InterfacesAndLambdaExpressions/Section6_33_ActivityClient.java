package Section6_InterfacesAndLambdaExpressions;
//to subclass an interface just use 'extend'
public interface Section6_33_ActivityClient {
	
	public void doSomething();
	
	default void defaultActivity()
	{
		System.out.println("This is default activity");
	}
}
