package Section6_InterfacesAndLambdaExpressions;

public class Section6_33_AnonymousInnerClasses {
	public static void main(String[] args)
	{
		Section6_33_Rock rock = new Section6_33_Rock();
		Section6_33_AnimateActivityManager manager = new Section6_33_AnimateActivityManager();
		manager.accept(rock);
		Section6_33_ActivityClient client = new Section6_33_ActivityClient() {
			
			@Override
			public void doSomething() {
			 System.out.println("this is an anonymous inner class");			
			}
		};
		Section6_33_NonMovableActivityClient nonMovable = new Section6_33_NonMovableActivityClient() {
			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void useRequested() {
				// TODO Auto-generated method stub
				
			}
		};
		
				manager.accept(client);
	}
}
