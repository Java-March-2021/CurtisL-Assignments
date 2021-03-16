package demoBankAccount;

public class BankAccount {
	private String accNum = "";
	private double checkBalance = 0, savBalance = 0;
	private static int accounts;
	private static double totMoney = 0;

	private String accGenerater() {
		double random = Math.random();
		random = random * 1000000000 + 999999999;
		int num = (int) random;
		System.out.println(num);
		return String.valueOf(num);
	}

	public BankAccount() {
		super();
		this.accNum = accGenerater();
		accounts++;
	}

	public BankAccount(String accNum) {
		super();
		this.accNum = accGenerater();
		accounts++;
	}

	public BankAccount(String accNum, double checkBalance) {
		super();
		this.accNum = accGenerater();
		this.checkBalance = checkBalance;
		accounts++;
	}

	public BankAccount(String accNum, double checkBalance, double savBalance) {
		super();
		this.accNum = accGenerater();
		this.checkBalance = checkBalance;
		this.savBalance = savBalance;
		accounts++;
	}

	public String getAccNum() {
		return accNum;
	}

	public double getCheckBalance() {
		return checkBalance;
	}

	public double getSavBalance() {
		return savBalance;
	}

	public static int getAccounts() {
		return accounts;
	}

	public static double getTotMoney() {
		return totMoney;
	}

	public void deposit(BankAccount acc, double deposit) {
		this.checkBalance += deposit;
		totMoney += deposit;
		System.out.println("Deposit of: " + deposit + " was entered");
	}

	public void withdraw(BankAccount acc, double withdraw) {
		if (withdraw > this.checkBalance) {
			System.out.println("Can not withdraw Insufficient funds");
		} else {
			this.checkBalance -= withdraw;
			totMoney -= withdraw;
			System.out.println("A withdrawal of: " + withdraw + "was taken out");
		}
	}
	
	public void accInfo () {
		System.out.println("Checking Account: $"+this.getCheckBalance());
		System.out.println("Checking Account: $"+this.getSavBalance());
	}

}
