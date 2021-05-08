import java.util.*;
class que_3{
	public static void main(String...args)
	{
		int[] a=new int[10];
		int r=a.length;
		int []b=new int[r];
		for(int i=0;i<a.length;i++)  //1..4..27..16.
		{
			
			if( i==0 || i%2!=0)
			 b[i]=i*i*i;
		    else
					b[i]=i*i; 
				
					 
		}
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		
    }
}
	
	
