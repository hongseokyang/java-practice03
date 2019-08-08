package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account() {}
	public Account(String accountNO) {
		this.accountNo = accountNO;
		System.out.println(this.accountNo+" 계좌가 개설되었습니다.");
	}
	public void save(int balance) {
		int tempBalance = this.balance;
		this.balance += balance;
		System.out.println(this.accountNo+" 계좌에"+(this.balance-tempBalance)+"만원이 입금되었습니다.");
	}
	public void deposit(int balance) {
		int tempBalance = this.balance;
		this.balance -= balance;
		System.out.println(this.accountNo+" 계좌에"+(tempBalance-this.balance)+"만원이 출금되었습니다.");
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNO) {
		this.accountNo = accountNO;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
