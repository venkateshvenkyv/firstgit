import java.util.*;

class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException (String msg) {
		super(msg);
	}
	
	
}

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) 
	{
		super(msg);
	}
	
}


public class Bank_transaction
{
	double balance=10000.0;
	int id=3850;
	double deposit,amt;
	public void savingaccount() 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("ID:"+id);
		System.out.println("Enter 1 for withdraw!");
		System.out.println("Enter 2 for Deposite");
		int n =s.nextInt();
		try 
		{
			if(n==1) 
			{
				System.out.println("Enter withdraw amt");
				amt=s.nextDouble();
				withdraw();
					
			}
			if(n==2) 
			{
				System.out.println("Enter deposite amt");
				amt=s.nextDouble();
				deposit=balance+amt;
				System.out.println("Total amount "+deposit);
			}
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e);
		}
		catch(IllegalBankTransactionException e)
		{
			System.out.println(e);
		}
		
		
	}
	public void withdraw() throws InsufficientBalanceException, IllegalBankTransactionException
	{
		if(amt>balance) 
		{
			throw new InsufficientBalanceException("insufficient balance!");
		}
		else
		{
			balance=balance-amt;
			if(amt<0) {
				throw new IllegalBankTransactionException("enter valid amount");
			}
			System.out.println("Current balance is:"+balance);
			
		}
	}
	
	public static void main(String[] args) 
	{
		
		Bank_transaction a=new  Bank_transaction();
		a.savingaccount();

	}

}

