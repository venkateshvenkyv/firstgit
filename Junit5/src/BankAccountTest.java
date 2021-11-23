

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		Bank_Account acc1=new Bank_Account(20000.00);
		
		assertThrows(InsufficientFundsException.class, ()->acc1.withDreaw(21000.0));

	}

}