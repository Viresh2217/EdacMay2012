package Day_2;
import java.util.Scanner;
	class Bank{
		private String accno;
		private String name;
		private long balence;
		int AdharNo;
		int rate = 4;
		
		Scanner sc = new Scanner(System.in);
		void openAccount() {
			System.out.println("Enter Account No :");
			accno = sc.next();
			System.out.println("Enter Name :");
			name = sc.next();
			System.out.println("Enter balence :");
			balence = sc.nextLong();
			System.out.println("Enter AdharNo :");
			AdharNo = sc.nextInt();
		}
		void NumberOfUsers() {
			
		}
		void checkBelence(int accno)
		{
			
		}
		void showDetails(String acno,int AdharNo)
		{	
			if(accno.equals(acno) && this.AdharNo == AdharNo)
			{
				System.out.println(accno+" "+name+ " "+balence);
			}
			else
			{
				System.out.println("Invalid Account NO");
			}
			
		}
		void setAccountNo()
		{
			accno = sc.next();
		}
		void Deposite(int amount,String ACNO)
		{
			if(ACNO.equals(accno))
			{
			balence += amount;
			}
			else
			{
				System.out.println("Invalid Account NO");
			}
		}
		void Withdrawal(int amount,String ACNO)
		{  
			if(balence > amount)
			{
				
				if(ACNO.equals(accno))
				{
					balence -= amount;
				}
				else
				{
				System.out.println("Invalid Account NO");
				}
			}
			else
			{
				System.out.println("Your Account balence is low");
			}
		}
		void SimpleInterest()
		{
		long SI = (balence * rate * 1)/100;
		}
	}
public class ExBank extends Bank
{
	
		public static void main(String[] args)
		{ 	int URchoice = 0;
		    String acno;
		    int AdharNo;
		
			Scanner sc = new Scanner(System.in);
			Bank users[] = null;
				do
				{
					
					
					System.out.println("Select anyone \n1.Create an accout\n"+"2.Check the Balence"+"\n3.Check Balence Of Perticuler User"+"\n4.Deposite"+"\n5.Withdrawal");
					URchoice = sc.nextInt();
					switch(URchoice)
					{
						case 1:									
								System.out.println("How many users you want");
								
								int num = sc.nextInt();
								users = new Bank[num];
								
								for(int i=0;i<users.length;i++)
								{
							
									users[i] = new Bank();
									System.out.println("Enter user "+(i+1)+" details");
									users[i].openAccount();
								}
								break;
						case 2:
								int ch;
							/*//	do
							//	{
									System.out.println("Main Menu\\n1. Display All\\n 2. Search By Account\\n 3.Deposit\\n 4. Withdrawal\\n 5.Exit");
									System.out.println("Enter your choice :");
									ch = sc.nextInt();
									switch(ch)
									{
										case 1 :
					// show all details of user
											for(int i=0;i<users.length;i++)
											{
												System.out.println("Enter the account number");
							//Enter the account number
												acno = sc.next();
												System.out.println("Enter AdharNo :");
												AdharNo = sc.nextInt();
												users[i].showDetails(acno,AdharNo);
											}
											break;
										case 3:
										//deposite amount
											for(int i=0;i<users.length;i++)
											{
												System.out.println("How Many Amount You Want Deposite");
												int Deposite = sc.nextInt();
												System.out.println("Enter the account number");
					//Enter the account number
												acno = sc.next();
												users[i].Deposite(Deposite,acno);
											}
											break; 
										case 4:
					// Withdrawal amount
					
											for(int i=0;i<users.length;i++)
											{
						
												System.out.println("How Many Amount You Want To Withdrwal");
												int Withdrawal = sc.nextInt();
												System.out.println("Enter the account number");
						//Enter the account number
												acno = sc.next();
												users[i].Withdrawal(Withdrawal,acno);
											}
											break;
										case 5:
											//int i=5;
											//if(i == 5) {
												System.exit(0);
											//	System.out.println("hello");
											//}
											break;
											
										default :
											System.out.println("Good Bye");
											break;
										
											
					
									}	
			    
					//1	}while(true);*/
								
						case 3:
							System.out.println("Enter Account Number");
							        sc.nextLine();
						          acno = sc.nextLine();
						          System.out.println("Enter Adhar Number");
						          AdharNo = sc.nextInt();
						          System.out.println("Enter the ID :");
						          int ID = sc.nextInt();
			// get information to particular person
						          users[ID].showDetails(acno,AdharNo);
						         
						          break;
					case 4:
						//deposit amount
							System.out.println("How Many Amount You Want Deposite");
							int Deposite = sc.nextInt();
							System.out.println("Enter the account number");
//Enter the account number
							acno = sc.next();
							  System.out.println("Enter the ID :");
					           ID = sc.nextInt();
							users[ID].Deposite(Deposite,acno);
						
					break; 
					case 5:
						// Withdrawal amount
							System.out.println("How Many Amount You Want To Withdrwal");
							int Withdrawal = sc.nextInt();
							System.out.println("Enter the account number");
	//Enter the account number
							acno = sc.next();
							  System.out.println("Enter the ID :");
					           ID = sc.nextInt();
							users[ID].Withdrawal(Withdrawal,acno);
						
						break;
					default :
						System.out.println("Good Bye");
						break;
					}
			
		
		
				}while(true);
		}
}
