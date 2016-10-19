package homework3;

public class radixsort {
	public static long[]array2;
	long[] sort(long[]array)
	{
		array2=array;
		int time=8;
		int tmp[]=new int[1<<time];
		long[] a=new long[array2.length];
		int radix=1;
		//int b=10;//2的32次方最多10位十进制数
		//按位一轮一轮排序
		long s=1<<time;
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<s;j++) tmp[j]=0;
			for(int j=0;j<array2.length;j++)
			{
				long num=(array2[j]>>(i*time))&(s-1);
				//radix*=10;
				//int num2=(int)((array2[j]/radix)%10);
				tmp[(int)num]++;
			}
			for(int j=1;j<s;j++)
			{
				tmp[j]=tmp[j]+tmp[j-1];
			}
			for(int j=array2.length-1;j>=0;j--)
			{
				long num=(array2[j]>>(i*time))&(s-1);
				a[tmp[(int)num]-1]=array2[j];
				tmp[(int)num]--;
			}
			//更新一下原数组
			for(int j=0;j<array2.length;j++)
				array2[j]=a[j];
		}
		a=null;
		tmp=null;
		return array2;
	}
}
