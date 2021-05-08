import java.util.Scanner;
class Rectangle{
public static void main(String args[])
{
	
	double k,x,y,u;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Width and Height:");
	 k=sc.nextDouble();
	 System.out.println(" Width :"+k);
	 x=sc.nextDouble();
	  System.out.println("Height is: "+x);
	 y=k*x;
	 System.out.println("Area is:"+k+"*"+x+"="+y);
	 u=2*(k*x);
	 System.out.println("Perimeter is: 2("+k+"*"+x+")="+y);
	  
	 
	 
	

}

}