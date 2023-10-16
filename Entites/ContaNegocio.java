package Entites;

public class ContaNegocio extends Conta {

	private Double loanLimit;

	public ContaNegocio() {

		super();
	}

	public ContaNegocio(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {

		if (loanLimit>amount) {
			
			balance += amount - 10;
	
		}
		
	}
}
