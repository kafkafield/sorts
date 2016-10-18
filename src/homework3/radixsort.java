package homework3;

public class radixsort {
	public static long[]array2;
	long[] sort(long[]array)
	{
		array2=array;
		int tmp[]=new int[10];
		long[] a=new long[array2.length];
		int radix=1;
		int b=10;//2的32次方最多10位十进制数
		//按位一轮一轮排序
		for(int i=0;i<b;i++,radix*=10)
		{
			for(int j=0;j<10;j++) tmp[j]=0;
			for(int j=0;j<array2.length;j++)
			{
				int num=(int)((array2[j]/radix)%10);
				tmp[num]++;
			}
			for(int j=1;j<10;j++)
			{
				tmp[j]=tmp[j]+tmp[j-1];
			}
			for(int j=array2.length-1;j>=0;j--)
			{
				int num=(int)(array2[j]/radix%10);
				a[tmp[num]-1]=array2[j];
				tmp[num]--;
			}
			//更新一下原数组
			for(int j=0;j<array2.length;j++)
				array2[j]=a[j];
		}
		return array2;
	}
}
