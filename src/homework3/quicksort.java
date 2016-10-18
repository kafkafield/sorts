package homework3;

public class quicksort {
	public static long[] array2;
	public static int num1=1;
	void init(long[] array)
	{
		array2=array;
		qsort(0,array2.length-1);
	}
	int partition(int low,int high)
	{
		num1++;
		int tmp=(int)(Math.random()*(high-low+1))+low;
		long tt=array2[low];
		array2[low]=array2[tmp];
		array2[tmp]=tt;
		long start=array2[low];
		while(low<high)
		{
			while(low<high&&array2[high]>=start) high--;
			array2[low]=array2[high];
			while(low<high&&array2[low]<=start) low++;
			array2[high]=array2[low];
				
		}
		array2[low]=start;
		return low;
	}
	void qsort(int low,int high)
	{
		if(low<high)
		{
			int medium=partition(low,high);
			qsort(low,medium-1);
			qsort(medium+1,high);
		}
	}
	
}
