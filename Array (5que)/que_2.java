import java.util.*;
class que_2{
	public static void main(String...args)
	{
		int a[]={5,14,35,89,140};
		int r=a.length;
		int b[]=new int[r];
		int avg=0;
		for(int i=0;i<a.length;i++)
		{
			if(i<(r-2))
			{
		     avg=(a[i]+a[i+1]+a[i+2])/3;
			 b[i]=avg;
			}
			else{
				if(i==(r-2))
				{
					avg=(a[i]+a[i+1])/2;
					b[i]=avg;
				}
				else
				{
					avg=(a[i])/1;
				    b[i]=avg;
				}				
			}
		}
		for(int i=0;i<b.length;i++)
		{
		     System.out.print(b[i]+" ");
			 
		}
		
		
    }
}
	
	
