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
		long tt=array2[high];
		array2[high]=array2[tmp];
		array2[tmp]=tt;
		long start=array2[high];
		int j=low,i=low-1;
		while(j<high)
		{
			if(array2[j]<=start)
			{
				i++;
				long tem=array2[i];
				array2[i]=array2[j];
				array2[j]=tem;
			}
			j++;
		}
		long tem=array2[i+1];
		array2[i+1]=array2[high];
		array2[high]=tem;
		return i+1;
	}
	void qsort(int low,int high)
	{
		if(low<high)
		{
			if(high-low<50)
			{
				long t[]=null;
				long tt[]=new long[high-low+1];
				Insertion tmp=new Insertion();
				for(int i=0;i<high-low+1;i++)
					tt[i]=array2[i+low];
				t=tmp.sort(tt);
				for(int i=0;i<high-low+1;i++)
					array2[low+i]=t[i];
			}
			int medium=partition(low,high);
			qsort(low,medium-1);
			qsort(medium+1,high);
		}
	}
	
}
