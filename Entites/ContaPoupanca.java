package Entites;

public class ContaPoupanca extends Conta {

	private Double interestRate;

	
	public ContaPoupanca() {
		super();
	}

	
	public ContaPoupanca(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	
	public Double getInterestRate() {
		return interestRate;
	}

	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	
	public void updateBalance() {
		balance += balance * interestRate;
	}


	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance-=5.00;
	}




}
