package homework3;

public class shellsort {
	public static long[] array2;
	long[] sort(long[] array)
	{
		array2=array;
		int h=1;
		while(h<array2.length)
		{
			h=h*3+1;
		}
		while(h>0)
		{
			for(int i=h;i<array2.length;i+=h)
			{
				if(array2[i]<array2[i-h])
				{
					long temp=array2[i];
					int j=i-h;
					while(j>=0&&array2[j]>temp)
					{
						array2[j+h]=array2[j];
						j=j-h;
					}
					array2[j+h]=temp;
				}
			}
			h=(h-1)/3;
		}
		return array2;
	}
}
