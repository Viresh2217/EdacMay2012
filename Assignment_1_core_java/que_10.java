import java.util.*;
class que_10{


public static void main(String... bo)
{

    Scanner pc=new Scanner (System.in);

    System.out.println("Enter Fahrenheit value ");

    double far=pc.nextDouble();
    double cal=( 5*(far-32)/9 );
    System.out.println("In Celsius is = "+cal);

}
}