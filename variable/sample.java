class Account
{
	String name;
	long number;
	double amount;

	Account(String p, long q, double r)
	{
		name = p;
		number = q;
		amount = r;
	}

	Account(String p, long q)
	{
		name = p;
		number =q;
	}

	void display()
	{
		System.out.println("\naccount name:" +name);
		System.out.println("account number:" +number);
		System.out.println("account amount:" +amount);

	}
	void display2()
	{
		System.out.println("\naccount name:" +name);
		System.out.println("account number:" +number);
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		//System.out.println("1 for with amount and 2 for without amount");
		System.out.print("1 for with amount and 2 for without amount");
		int n=1;
		if(n==1)
		{
			Account a1 = new Account("mangesh",69545322l,500.00);
			a1.display();
			//n=2;
		}
		else if(n==2)
		{
			Account a2 = new Account("ramesh",552255l);
			a2.display();
		}
	}
}
