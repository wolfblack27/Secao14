package Aplication;

import java.util.ArrayList;
import java.util.List;

import Entites.Conta;
import Entites.ContaNegocio;
import Entites.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		
		Conta acc = new Conta(1001, "Alex", 0.0);
		ContaNegocio bacc = new ContaNegocio(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Conta acc1 = bacc;
		Conta acc2 = new ContaNegocio(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		ContaNegocio acc4 = (ContaNegocio)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof ContaNegocio) {
			ContaNegocio acc5 = (ContaNegocio)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	
	// Testando a anotação @Override
		
		Conta cp = new ContaPoupanca(1212, "Thiago", 100.00, 10.0);
		cp.withdraw(10);
		
		System.out.printf("Seu saldo da conta Poupança: %.2f %n",cp.getBalance());
		Conta cn = new ContaNegocio(1111, "Thiago", 100.00, 500.00);
		cn.withdraw(10);
		System.out.printf("Seu saldo da conta Negocio: %.2f%n",cn.getBalance());
		
		
		
	
		
	
			
			
			
		
		
	}

}
