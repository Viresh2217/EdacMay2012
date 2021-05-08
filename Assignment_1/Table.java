import java.util.Scanner;
class Table{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	int i,j;
	System.out.println("Enter a number which table you want");
	i=sc.nextInt();
	for(j=1;j<=10;j++)
	{
		System.out.println(+i+"*"+j+"="+i*j);

	}
	
	

}

}