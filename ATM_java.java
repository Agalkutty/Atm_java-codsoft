import java.util.Scanner;
class ATM_java
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		double balance=50000,withdraw,deposit;
		boolean Atm_feature=true;
		do
		{
			System.out.println("ATM MACHINE");
		    System.out.println("\n1.WITHDRAW \n2.DEPOSIT \n3.CHECK BALNCE \n4.EXIT");
		    int input=sc.nextInt();
			if(input==4)
			{
				Atm_feature=false;
				break;
			}
			if(input==3)
			{
				System.out.println("AVAILABLE BALANCE:"+balance);
				break;
			}
			if(input==2)
			{
				System.out.println("ENTER THE AMOUNT TO BE DEPOSITED:");
			    deposit=sc.nextDouble();
				balance=balance+deposit;
				System.out.println(" YOUR MONEY HAS BEEN SUCCESSFULLY DEPOSITED ");
				System.out.println("AVAILABLE BALANCE:"+balance);
				break;
			}
			if(input==1)
			{
				System.out.println("ENTER THE AMOUNT TO BE WITHDRAWN:");
				withdraw=sc.nextDouble();
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println("PLEASE COLLECT YOUR MONEY");
					System.out.println("AVAILABLE BALANCE:"+balance);
				}
				else
				{
					System.out.println("INSUFFICIENT BALANCE");
				}
				break;
			}
			
			}while (Atm_feature);
		System.out.println("\n\n THANK YOU ");
	}
} 
		