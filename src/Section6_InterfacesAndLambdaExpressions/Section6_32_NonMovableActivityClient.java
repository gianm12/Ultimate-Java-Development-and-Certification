package Section6_InterfacesAndLambdaExpressions;
//This interface extends the other interface aka subclassing interface...acts just like parent->child.
//You can extend multiple interfaces. This only applies to interfaces, cand do this with classes!!

public interface Section6_32_NonMovableActivityClient extends Section6_32_ActivityClient, Section6_32_LastInterface
{
	void useRequested();
}
