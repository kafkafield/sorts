package homework3;

public class mergesort {
	public static long[] array2;
	void init(long[] array)
	{
		array2=array;
		long temp[]=new long[array.length];
		msort(temp,0,array2.length-1);
	}
	void msort(long[]a1,int left,int right)
	{
		if(left<right)
		{
		int medium=(left+right)/2;
		msort(a1,left,medium);
		msort(a1,medium+1,right);
		merge(a1,left,medium,right);
		}
	}
	void merge(long[]a1,int left,int medium,int right)
	{
		int i=left;
		int j=medium+1;
		int index=left;
		while(i<=medium&&j<=right)
		{
			if(array2[i]>array2[j])
			{
				a1[index++]=array2[j];
				j++;
			}
			else
			{
				a1[index++]=array2[i];
				i++;
			}
		}
		while(i<=medium)
		{
			a1[index++]=array2[i];
			i++;
		}
		while(j<=right)
		{
			a1[index++]=array2[j];
			j++;
		}
		for(i=left;i<=right;i++)
		{
			array2[i]=a1[i];
		}
	}
}
