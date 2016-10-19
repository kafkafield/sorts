package homework3;

public class shellsort {
	public static long[] array2;
	long[] sort(long[] array)
	{
		array2=array;
		int h=1;
		int index[]=new int[]{1, 9, 34, 182, 836, 4025, 19001, 90358, 428481, 2034035, 9651787, 45806244, 217378076, 1031612713};
		for(int i=0;i<13;i++)
		{
			if(array2.length/index[i]>=2&&array2.length/index[i+1]<2){
				h=i;
				break;
			}
		}
		while(h>=0)
		{
			int time=index[h];
			for(int i=time;i<array2.length;i++)
			{
				if(array2[i]<array2[i-time])
				{
					long temp=array2[i];
					int j=i-time;
					while(j>=0&&array2[j]>temp)
					{
						array2[j+time]=array2[j];
						j=j-time;
					}
					array2[j+time]=temp;
				}
			}
			h--;
		}
		return array2;
	}
}
