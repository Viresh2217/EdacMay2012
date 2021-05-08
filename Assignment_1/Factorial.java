class Factorial{
public static void main(String args[])
{
 System.out.println("Enter a Number");  //5
 Scanner pc= new Scanner(System.in);
 int n= pc.nextInt();   //5
 
 
 int temp=1;
 for(int i=1;i<=n;i++)   //5*4*3*2*1=  
 {
 temp=temp*i;

 
 }
 System.out.print(temp);
 
 
}
}