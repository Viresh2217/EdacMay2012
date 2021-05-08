class starpat_11
{
public static void main(String...args)
{
	for(int i=1;i<=5;i++)
	{
                  for(int k=1;k<i;k++)
				   {
					System.out.print(" ");
				   }
				for(int h=5;h>=i;h--)
				{
					System.out.print("*");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
	}
}
				
}