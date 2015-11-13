package Section6_InterfacesAndLambdaExpressions;
/*Here we are implementing essentially 2 interfaces. Since 'nonMovableActivityClient extends ActivityClient...
 * By doing this, we have to override all the functions of both interfaces. This object can be of type of either interface. Look at
 * "SubclassingINterfaceDefault" for an example.
 */
public class Section6_32_Rock implements Section6_32_NonMovableActivityClient{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("I cant do anything on my one - im a rock!");
	}

	@Override
	public void useRequested() {
		// TODO Auto-generated method stub
		System.out.println("i am being used!s");
	}

	@Override
	public void random() {
		// TODO Auto-generated method stub
		System.out.println("im a random method");
	}
	
	@Override
	public void defaultActivity()
	{
		System.out.println("this is rock implementation (default implementation)");
	}

}
