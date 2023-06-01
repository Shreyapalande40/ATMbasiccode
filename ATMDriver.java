import java.util.Scanner;
class ATM 
{
	private int balance = 5000;
	private int deposit;
	int withdraw;
	private int pin = 2050;
	private int amount;
	//to get current balance
	public int getBalance()
	{
		
		return balance ;

	}
	
	// to deposit money

	public void setDeposit(int deposit)
	{
		this.balance = balance;
		if (deposit < 0)
		{
			System.out.println("Balance canot be -");

		}
		else
		{
			this.deposit=deposit;
			System.out.println("Cash Deposited");
			System.out.println("Your current balance is"+(balance=deposit + balance));
		}
	}
	// to set pin
	public void setPin(int pin)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your old pin");
		pin = s.nextInt();
		if (pin ==2050)
		{

			System.out.println("Enter Your new pin");
			
			pin = s.nextInt();
			System.out.println("Your pin has been changed successfully");

			
		}
		else
		{
			
			System.out.println("Your pin is not correct");

		}
	}
	// to withdraw money
	public void setwithdraw(int amount)
	{
		if (amount > 0)
		{
			System.out.println("WITHDRAWN DONE");
			System.out.println("Your current balance is"+(balance=balance-amount));
			
		}
		else
		{
			
			System.out.println("insufficient balance");

		}
	}
		
}
class ATMDriver
	{
	  public static void main(String[] args) 
	{
		   Scanner s = new Scanner(System.in);
		    ATM a = new ATM();
		  System.out.println("Enter your pin");
		  int pin = s.nextInt();
		  if (pin == 2050)
		  {
		  System.out.println("Correct pin");
		  System.out.println("Make your choice");
		  System.out.println("1.Withdraw your cash");
		  System.out.println("2.check your balance");
		  System.out.println("3.Deposit cash");
		  System.out.println("4.Change pin/Generate pin");
		  }
		  else
		{
			  System.out.println("InCorrect pin");
		}
		System.out.println("Enter your choice");
		  int num = s.nextInt();
		  switch (num)
		  {
		  case 1: System.out.println("1.Withdraw your cash");
		  a.setwithdraw(s.nextInt());
		  case 2:System.out.println("2.Your balance is"+(a.getBalance()));
		   
		  case 3:System.out.println("3.Deposit cash");
		  a.setDeposit(s.nextInt()); 
		  case 4:System.out.println("4.Change pin/Generate pin");
		  a.setPin(pin); 
		  }
		
	}
	}