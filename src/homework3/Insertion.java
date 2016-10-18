package homework3;

public class Insertion {
	public long[] array2;
	long[] sort(long array[])
	{
		array2=array;
		for(int i=1;i<array.length;i++)
		{
			long temp=array2[i];
			int j;
			int k=0;
			for( j=i-1;j>=0;j--)
			{
				if(temp<array2[j])
				{
					array2[j+1]=array2[j];
				}
				else
				{
					k=1;
					array2[j+1]=temp;
					break;
				}
			}
			if (k==0)
			array2[0]=temp;
		}
		return array2;
	}
}
