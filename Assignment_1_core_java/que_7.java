import java.util.*;
class que_7{


public static void main(String... bo)
{

       Scanner pc= new Scanner(System.in);
  System.out.println("Enter a mark of five subject");
  int[] a=new int[5];
double sum=0;
  for(int i=0;i<a.length;i++)
  {
  	a[i]=pc.nextInt();
  	sum=sum+a[i];
  }
  System.out.println(sum);
  
double per= (sum/500)*100;




System.out.println("percentage marks = "+per+"%");  

}


}