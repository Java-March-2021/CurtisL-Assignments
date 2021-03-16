package demoBankAccount;

public class BankAccountTest {
	public static void main(String[]args) {
		BankAccount JohnAccount = new BankAccount();
		JohnAccount.withdraw(JohnAccount, 200);
		JohnAccount.deposit(JohnAccount, 500);
		JohnAccount.accInfo();
	}
	
	
}
