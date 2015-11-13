package Section6_InterfacesAndLambdaExpressions;

public class Section6_33_AnonymousInnerClasses {
	public static void main(String[] args)
	{
		Section6_33_Rock rock = new Section6_33_Rock();
		Section6_33_AnimateActivityManager manager = new Section6_33_AnimateActivityManager();
		manager.accept(rock);
	}

}
