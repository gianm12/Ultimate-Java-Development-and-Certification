package Section7_CollectionsAndGenerics;

public class Section7_38_OracleArrayList {

	private String[] mItems;
	private int mFilledSpots;
	public Section7_38_OracleArrayList()
	{
		mItems = new String[10];
		
	}
	public void add(String item)
	{
		System.out.println("im in add method! number is " + item);
		if(mFilledSpots< mItems.length)
		{
			mItems[mFilledSpots] = item;
			mFilledSpots++;
		}
		else
		{
			String[] copy = mItems;
			mItems = new String [mItems.length +10];
			for(int i = 0; i <copy.length; i++)
			{
				mItems[i] = copy[i];
			}
			
			add(item);
		}
	}
	public String get(int index)
	{
		System.out.println("in the get method! index is: " + index);
		
		return mItems[index];
	}
	
	public int size()	
	{
		return mItems.length;
	}
}
