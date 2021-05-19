import java.util.*;
class que_3{
	

	public static void main(String...args)
	{



		Scanner pc=new Scanner(System.in);
		System.out.println("Enter three number");

		double X=pc.nextDouble();
		double Y=pc.nextDouble();
		double Z=pc.nextDouble();

		X=(X*X + (3*X )- 7 );
		System.out.println(X);

		Y = X++ + ++X ;
		System.out.println(+X+" "+Y);
		Z=X++ - --Y - --X  +  X++ ;
		System.out.println(+X+" "+" "+Y+" "+Z);
		Z=(int)(x && y || !(X || Y));
		System.out.println(Z);



	}
}