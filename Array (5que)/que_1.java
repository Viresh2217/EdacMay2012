import java.util.*;
class que_1{
	public static void main(String...args)
	{
		int[] a={23,60,94,3,102};
		int n=a.length;
		int[] b={42,16,74};    // o/p=23..42..60.
		int m=b.length;
		int[] c= new int[n+m];
		
        int i = 0, j = 0, k = 0;
      
        while (i < n && j < m)
        {
            c[k++] = a[i++];
            c[k++] = b[j++];
        }
        while (i < n)
            c[k++] = a[i++];
     
        while (j < m)
            c[k++] = b[j++];
		
        for ( i = 0; i < n+m; i++)
            System.out.print( c[i] + " ");
		
    }
}
	
	
