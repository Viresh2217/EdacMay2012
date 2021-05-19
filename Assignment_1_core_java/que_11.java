import java.util.*;
class que_11{


public static void main(String... bo)
{

Scanner pc=new Scanner(System.in);

System.out.println("Enter two number");
int a=pc.nextInt();
int b=pc.nextInt();


a=a+b;    
b=a-b;
a=a-b;

System.out.println(+a+" "+b);



}
}