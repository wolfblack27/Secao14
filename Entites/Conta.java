package Entites;

public class Conta {

	private Integer number;
	private String holder;
	protected Double balance;

	
	public Conta() {
		
	}
	public Conta(Integer number, String holder, Double balance) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}

	
	
	public void withdraw(double amount) {
		
		balance-= amount;
	}
	
	
	public void deposit(double amount) {
		
		balance+=amount;
	}
	
	
}
