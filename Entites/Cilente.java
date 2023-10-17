package Entites;

import java.util.ArrayList;
import java.util.List;

public abstract class Cilente {

	private String nome;
	private String endereco;
	private List<Conta> conta = new ArrayList<Conta>();
	
	
	public Cilente() {
		
	}


	public Cilente(String nome, String endereco) {
		
		this.nome = nome;
		this.endereco = endereco;
	}
	
	
	public void adicionaConta(Conta conta) {
		this.conta.add(conta);
		
		
	}
	
	
	public List<Conta> getConta() {
		
		return this.conta;
	}
	
	

}
