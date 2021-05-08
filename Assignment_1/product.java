import java.util.Scanner;
class Product{
public static void main(String args[])
{
	int i,j;
	float k;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Input first number:");
	 i=sc.nextInt();
	System.out.println("Input second number:");
	  j=sc.nextInt();
	 k=i*j;
	
	System.out.println("Product is:"+k);

}

}