import java.util.Scanner;

class Dec_binary{

   public static void main(String args[])
   {
	   Scanner pc= new Scanner(System.in);
	   
	   int binary[]= new int[15];    
	   int index=0;
	   System.out.print("Enter a number");
	   int n=pc.nextInt();    // n=10
	   while(n>0)
	   {
	   binary[index]= n%2;
	   n=n/2;
	   index++;
	   }
	   for(int k=index-1;k>=0;k--)
	   System.out.print(" "+binary[k]);
	   
	   
	   
	   
   }



 }