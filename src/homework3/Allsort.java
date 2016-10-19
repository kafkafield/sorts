package homework3;
import java.util.Random;
import java.math.*;

public class Allsort {
	public static void main(String[] Args)
	{
		int s=Integer.parseInt(Args[0]);
		int pre=Integer.parseInt(Args[1]);
		int size = s;
		Random ran1=new Random();
		long[]numb=new long[size];
		//long[]par=new long[size];
		long[]ans=null;
		long sum=4294967296L;
		int num=10;
		for(int i=0;i<size;i++)
		{
			numb[i]=(long)(ran1.nextDouble()*sum);
			//par[i]=numb[i];
		}
		/*System.out.println("���ɵĳ�ʼ���飺");
		for(int i=0;i<num;i++)
		{
			System.out.print(numb[i]+",");
		}
		System.out.println("\n");
		*/
		long startTime;
		long endTime;
		if(pre==1){
		//shellsort�����㷨����
		 startTime=System.currentTimeMillis();   //��ȡ��ʼʱ�� 
		shellsort sll=new shellsort();
		ans=sll.sort(numb);
		 endTime=System.currentTimeMillis(); //��ȡ����ʱ��
		System.out.println("Shellsort�����㷨��ʱ"+(endTime-startTime)+"ms");
		/*for(int i=0;i<num;i++)
		{
			System.out.print(ans[i]+",");
		}
		System.out.println("\n");
		*/
		}
		if(pre==2){
		/*for(int i=0;i<numb.length;i++)
		{
			numb[i]=par[i];
			//System.out.print(numb[i]+",");
		}*/
		System.out.println("\n");
		
		//quicksort�����㷨����
		startTime=System.currentTimeMillis();   //��ȡ��ʼʱ�� 
		quicksort qc=new quicksort();
		qc.init(numb);
		ans=qc.array2;
		endTime=System.currentTimeMillis(); //��ȡ����ʱ��
		System.out.println("Quicksort�����㷨��ʱ"+(endTime-startTime)+"ms");
		/*for(int i=0;i<num;i++)
		{
			System.out.print(ans[i]+",");
		}
		System.out.println("\n");
		*/
		System.out.println("\n�ݹ����Ϊ��"+qc.num1+"\n");
		}
		if(pre==3){
			/*for(int i=0;i<numb.length;i++)
			{
				numb[i]=par[i];
				//System.out.print(numb[i]+",");
			}*/
		//System.out.println("\n");	
		
		//radixsort�����㷨����
		startTime=System.currentTimeMillis();   //��ȡ��ʼʱ�� 
		radixsort rd=new radixsort();
		ans=rd.sort(numb);
		endTime=System.currentTimeMillis(); //��ȡ����ʱ��
		System.out.println("Radixsort�����㷨��ʱ"+(endTime-startTime)+"ms");
		/*for(int i=0;i<num;i++)
		{
			System.out.print(ans[i]+",");
		}
		System.out.println("\n");
		*/
		}
		if(pre==4){
			/*for(int i=0;i<numb.length;i++)
			{
				numb[i]=par[i];
				//System.out.print(numb[i]+",");
			}*/
		System.out.println("\n");
		
		
		//mergesort�����㷨����
		startTime=System.currentTimeMillis();   //��ȡ��ʼʱ�� 
		mergesort mg=new mergesort();
		mg.init(numb);
		ans=mg.array2;
		endTime=System.currentTimeMillis(); //��ȡ����ʱ��
		System.out.println("Mergesort�����㷨��ʱ"+(endTime-startTime)+"ms");
		/*for(int i=0;i<num;i++)
		{
			System.out.print(ans[i]+",");
		}
		System.out.println("\n");
		*/
		}
		if(pre==5)
		{
			/*for(int i=0;i<numb.length;i++)
			{
				numb[i]=par[i];
				//System.out.print(numb[i]+",");
			}*/
		System.out.println("\n");
		//insertion�����㷨����
		startTime=System.currentTimeMillis();   //��ȡ��ʼʱ�� 
		Insertion ins=new Insertion();
		ans=ins.sort(numb);
		endTime=System.currentTimeMillis(); //��ȡ����ʱ��
		System.out.println("Insertion�����㷨��ʱ"+(endTime-startTime)+"ms");
		/*for(int i=0;i<num;i++)
		{
			System.out.print(ans[i]+",");
		}
		System.out.println("\n");
		*/
		System.out.println("\n");	
		}
	}
}
