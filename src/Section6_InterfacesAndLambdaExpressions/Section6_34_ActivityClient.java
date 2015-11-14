package Section6_InterfacesAndLambdaExpressions;
//to subclass an interface just use 'extend'
public interface Section6_34_ActivityClient {
	
	public void doSomething(int x);
	
	default void defaultActivity()
	{
		System.out.println("This is default activity");
	}
}
