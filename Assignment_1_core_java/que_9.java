import java.util.*;

class que_9{



	public static void main(String...ho)
	{

       Scanner pc=new Scanner (System.in);
       System.out.println("Enter a number");

        int num= pc.nextInt();     //655

          int a =(int)(num/365);
          System.out.print("Year "+a+" ");
          int b=(num%365);
          int c=(int)(b/30);
            System.out.print("month "+c+" ");
            int x=(b%30);
            System.out.print("days "+c);


       


         



	}
}