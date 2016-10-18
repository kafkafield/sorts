package homework3;
import java.util.Random;
import java.math.*;

public class Allsort {
	public static void main(String[] Args)
	{
		int size=10;
		Random ran1=new Random();
		long[]numb=new long[size];
		long[]par=new long[size];
		long[]ans=new long[size];
		long sum=4294967296L;
		int num=10;
		for(int i=0;i<size;i++)
		{
			numb[i]=(long)(ran1.nextDouble()*sum);
			par[i]=numb[i];
		}
		System.out.println("生成的初始数组：");
		for(int i=0;i<num;i++)
		{
			System.out.print(numb[i]+",");
		}
		System.out.println("\n");
		
		
		
		//shellsort排序算法测试
		long startTime=System.currentTimeMillis();   //获取开始时间 
		shellsort sll=new shellsort();
		ans=sll.sort(numb);
		long endTime=System.currentTimeMillis(); //获取结束时间
		System.out.println("Shellsort排序算法耗时"+(endTime-startTime)+"ms");
		for(int i=0;i<num;i++)
		{
			System.out.print(ans[i]+",");
		}
		System.out.println("\n");
		for(int i=0;i<numb.length;i++)
		{
			numb[i]=par[i];
			//System.out.print(numb[i]+",");
		}
		//System.out.println("\n");
		
		//quicksort排序算法测试
		startTime=System.currentTimeMillis();   //获取开始时间 
		quicksort qc=new quicksort();
		qc.init(numb);
		ans=qc.array2;
		endTime=System.currentTimeMillis(); //获取结束时间
		System.out.println("Quicksort排序算法耗时"+(endTime-startTime)+"ms");
		for(int i=0;i<num;i++)
		{
			System.out.print(ans[i]+",");
		}
		System.out.println("\n递归层数为："+qc.num1+"\n");
		
		for(int i=0;i<numb.length;i++)
		{
			numb[i]=par[i];
			//System.out.print(numb[i]+",");
		}
		//System.out.println("\n");
		
		//mergesort排序算法测试
		startTime=System.currentTimeMillis();   //获取开始时间 
		mergesort mg=new mergesort();
		mg.init(numb);
		ans=mg.array2;
		endTime=System.currentTimeMillis(); //获取结束时间
		System.out.println("Mergesort排序算法耗时"+(endTime-startTime)+"ms");
		for(int i=0;i<num;i++)
		{
			System.out.print(ans[i]+",");
		}
		System.out.println("\n");
		
		for(int i=0;i<numb.length;i++)
		{
			numb[i]=par[i];
			//System.out.print(numb[i]+",");
		}
		//System.out.println("\n");
		
		//radixsort排序算法测试
		startTime=System.currentTimeMillis();   //获取开始时间 
		radixsort rd=new radixsort();
		ans=rd.sort(numb);
		endTime=System.currentTimeMillis(); //获取结束时间
		System.out.println("Radixsort排序算法耗时"+(endTime-startTime)+"ms");
		for(int i=0;i<num;i++)
		{
			System.out.print(ans[i]+",");
		}
		System.out.println("\n");
		
		for(int i=0;i<numb.length;i++)
		{
			numb[i]=par[i];
			//System.out.print(numb[i]+",");
		}
		//System.out.println("\n");
		
		//insertion排序算法测试
		startTime=System.currentTimeMillis();   //获取开始时间 
		Insertion ins=new Insertion();
		ans=ins.sort(numb);
		endTime=System.currentTimeMillis(); //获取结束时间
		System.out.println("Insertion排序算法耗时"+(endTime-startTime)+"ms");
		for(int i=0;i<num;i++)
		{
			System.out.print(ans[i]+",");
		}
		System.out.println("\n");		
	}
}
