

import junit.framework.Test;

public class Bank_Account {
	
	double accBanlance;
	
	
	
	public Bank_Account(double accBanlance) {
		super();
		this.accBanlance = accBanlance;
	}

	
	void withDreaw(double withDrawAmt) throws InsufficientFundsException {
		
		if(withDrawAmt>accBanlance)
			throw new InsufficientFundsException("InsufficientFundsException");
		
		accBanlance=accBanlance-withDrawAmt;
		
		System.out.println("Amount WithDrawn: "+withDrawAmt);
		System.out.println("Available Balance: "+accBanlance);
	}
	
	public static void main(String[] args) {
		
		Bank_Account acc1=new Bank_Account(20000.00);

		try {
			acc1.withDreaw(20000.00);
		} catch (InsufficientFundsException e) {
		
			e.printStackTrace();
		}
		
	}

}
