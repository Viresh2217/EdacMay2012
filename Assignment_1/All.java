import java.util.Scanner;
class All{
public static void main(String args[])
{
	int i,j,l,m,y;
	float k,a,s;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Input first number:");
	 i=sc.nextInt();
	System.out.println("Input second number:");
	  j=sc.nextInt();
	  l=i+j;
	   System.out.println("Addition is is:"+l);
	   m=i-j;
	    System.out.println("Substration is:"+m); 
	 y=i*j;
	 System.out.println("Product is:"+y);
	 k=(float)i/j;
	  System.out.println("Division is:"+k);
	  a=i%j;
	   System.out.println("Mod is:"+a);

}

}
//input is 125 and 24