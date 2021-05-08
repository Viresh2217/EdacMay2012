import java.util.Scanner;
class Average{
public static void main(String args[])
{
	
	System.out.println("Enter Three Number");
	Scanner pc=new Scanner(System.in);
	int i,j,l;
	float k;
	i=pc.nextInt();
	j=pc.nextInt();
	l=pc.nextInt();
	k=(i+j+l)/3;
	System.out.println("Average of three number is:"+k);
	
}

}