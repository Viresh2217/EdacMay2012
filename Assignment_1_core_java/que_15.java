import java.util.*;
class que_15{


public static void main(String... bo)
{

Scanner pc=new Scanner(System.in);

System.out.println("Enter a gender (m 0r f)");

String s= System.console().readLine();
System.out.println("Enter your age");
int age=pc.nextInt();

switch (s) {

        case "m":
              if(age>=21 && age<=30)
              	System.out.println("Your eligible for marriage");
              else
              	System.out.println("Your not eligible for marriage");
              break;
         case "f":
           if(age>=18 && age<=30)
           		System.out.println("Your eligible for marriage");
              else
              	System.out.println("Your not eligible for marriage");
              break;
              default :
                   System.out.println("not intailize");
              

}

}
}