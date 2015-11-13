package Section6_InterfacesAndLambdaExpressions;

public class Section6_32_SubclassingInterfacesDefault {
	public static void main(String[] args) {
		
		Section6_32_Rock rock = new Section6_32_Rock();
		//rock.useRequested();
		
		Section6_32_Rock rock1 = new Section6_32_Rock();
	

		Section6_32_ActivityClient item0= rock;


			item0.doSomething();
			
		
		
		Section6_32_NonMovableActivityClient item1= rock1;
		item1.doSomething();
		item1.useRequested();
		rock.random();
		item1.random();
		rock.defaultActivity();
		item1.defaultActivity();
		
		}
	}

