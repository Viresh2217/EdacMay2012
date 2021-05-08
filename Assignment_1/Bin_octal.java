import java.util.Scanner;

class Bin_octal{
public static void main(String args[])
{
	int a,i,temp;  
	i=0;
	temp=0;
	int dc[]=new int[10];
      System.out.println("Enter Binary Number");
	   Scanner pc=new Scanner(System.in); 
	  a=pc.nextInt();
	
	 while(a!=0)
	 {
		 for(int h=0;h<=2;h++)
		 {
                  double power=Math.pow(2,i);
		 temp=temp+(int)power*(a%10);
		 a=a/10;
		 i++;	
		 
		 }
		 
		 dc[0]=temp;
		 temp=0;
	    
	 }
	 
	   System.out.print(dc[2]); 
	   System.out.print(dc[1]); 
	   System.out.print(dc[0]); 

}

}
