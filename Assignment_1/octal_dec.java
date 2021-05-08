import java.util.Scanner;

class octal_dec{
public static void main(String args[])
{
	int a,i,temp;  
	i=0;
	temp=0;
      System.out.println("Enter Octal Number");
	   Scanner pc=new Scanner(System.in); 
	  a=pc.nextInt();
	
	 while(a!=0)
	 {
                  double power=Math.pow(8,i);
		 temp=temp+(int)power*(a%10);
		 a=a/10;
		 i++;	
            
	 }
	   System.out.println("Decimal Value is: "+temp); 

}

}