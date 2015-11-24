package Section7_CollectionsAndGenerics;

public class Section7_38_OracleArrayList<T> {

	private T[] mItems;
	private int mFilledSpots;
	public Section7_38_OracleArrayList()
	{
		mItems = (T[]) new Object[10];
		
	}
	public void add(String item)
	{
		//System.out.println("im in add method! number is " + item);
		if(mFilledSpots< mItems.length)
		{
			mItems[mFilledSpots] = item;
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
	public String get(int index)
	{
		return mItems[index];
	}
	
	public int size()	
	{
		return mItems.length;
	}
}
