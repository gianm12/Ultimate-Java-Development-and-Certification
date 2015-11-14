package Section6_InterfacesAndLambdaExpressions;

public class Section6_34_LambdaExpressions {
public static void main(String[] args) {
	
	Section6_34_AnimateActivityManager manager = new Section6_34_AnimateActivityManager();
	
	Section6_34_ActivityClient client = new Section6_34_ActivityClient() {
		
		@Override
		public void doSomething(int x) {
		System.out.println("This is an anonymous inner class being provided to a method.");			
		}
	};
	manager.accept(client);
	//Rule: You can ONLY use a lambda expression when an interface has ONLY one abstract method then we can use this lambda
	//the () goes only to the abstract method in the interface (in our case the 'doSomething' that it can find. It does the same thing that the 
	//line 8-15 did.
	//Lambda expressions are especially useful when using asynchronous code. 
	manager.accept((value)->
	{
		System.out.println("This is lambda expression " + value);
	});
}
}
