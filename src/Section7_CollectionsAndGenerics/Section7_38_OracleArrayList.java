package Section7_CollectionsAndGenerics;

public class Section7_38_OracleArrayList<T> {

	private T[] mItems;//T means that it can be any type (int, string, double). Read more about it
	//https://docs.oracle.com/javase/tutorial/java/generics/types.html
	private int mFilledSpots;
	public Section7_38_OracleArrayList()
	{
		mItems = (T[]) new Object[10];
		
	}
	public void add(T item)
	{
		
		if(mFilledSpots< mItems.length)
		{
			mItems[mFilledSpots] = (T) item;
			mFilledSpots++;
		}
		else
		{
			T[] copy = mItems;
			mItems =  (T[]) new Object[mItems.length +10];
			for(int i = 0; i <copy.length; i++)
			{
				mItems[i] = copy[i];
			}
			
			add(item);
		}
	}
	public T get(int index)
	{
		return mItems[index];
	}
	
	public int size()	
	{
		return mItems.length;
	}
}
