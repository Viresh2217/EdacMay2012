class Pyr_2
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
				for(int j=8;j>=i;j--)
				{		
					System.out.print(" ");
				}
				for(int h=1;h<=i;h++)
				{
					System.out.print(" "+h);
				}
				System.out.println();
		}
		
	}
	
}