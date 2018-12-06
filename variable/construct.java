import java.util.Scanner;
class Account
{
	String cst_name;
	long cst_no;
	double cst_amt;

	Account(String p, long q, double r)
	{
		cst_name=p;
		cst_no=q;
		cst_amt=r;
	}
	
	Account(String a, long b)
	{
		cst_name=a;
		cst_no=b;
	}

	void display()
	{
		System.out.println("account holder name:" +cst_name);
		System.out.println("account holder number:" +cst_no);
		System.out.println("account holder amount:" +cst_amt);
	}

	void display2()
	{
		System.out.println("account holder name:" +cst_name);
		System.out.println("account holder number:" +cst_no);
	}
}


class mainclass
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("1 for account with deposit and  2 for account without deposit");
		int n = s1.nextInt();
		
		if(n==1)
		{
		
		System.out.println("Enter your name:");
		String name = s1.next();

		
		System.out.println("Enter your number:");
		long number = s1.nextLong();

		
		System.out.println("Enter your amount");
		double amnt = s1.nextDouble();


		Account a1 = new Account(name,number,amnt);
		a1.display();

		}
		else if(n==2)
		{
		System.out.println("Enter your name:");
		String name = s1.next();

		
		System.out.println("Enter your number:");
		long number = s1.nextLong();

		Account a2 = new Account(name,number);
		a2.display2();
		} 
			
	}
}