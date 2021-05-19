import java.util.*;
class que_14{


public static void main(String... bo)
{

Scanner pc=new Scanner(System.in);

System.out.println("Enter a year ");
int year=pc.nextInt();

if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Leap year");
      else
         System.out.println("Not leap year");


}
}	