package test;

public class Account {
	
	
	//필드
	private String name;
	private long balance;
	
	
	//생성자
	public Account(String name) {
		this.name = name;
	}


	
	//메소드
	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}
	
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	

}
