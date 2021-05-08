import java.util.Scanner;

class Bin_dec{
public static void main(String args[])
{
	int a,i,temp;  
	i=0;
	temp=0;
      System.out.println("Enter Binary Number");
	   Scanner pc=new Scanner(System.in); 
	  a=pc.nextInt();
	
	 while(a!=0)
	 {
                  double power=Math.pow(2,i);
		 temp=temp+(int)power*(a%10);
		 a=a/10;
		 i++;	
            
	 }
	   System.out.println("Decimal Value is: "+temp); 

}

}
/*while(a!=0){
			
			int k = a%10;
			double power = Math.pow(2,i);
			temp = temp + (k* (int)power);
			a= a/10;
			i++;
		}
*/