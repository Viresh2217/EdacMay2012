class Pyr_1
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
					System.out.print(" "+i);
				}
				System.out.println();
		}
		
	}
	
}