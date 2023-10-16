package Aplication;

import Entites.ContaNegocio;

public class Main {

	public static void main(String[] args) {
		
		ContaNegocio cn = new ContaNegocio(1201, "Thiago Ventura", 100.00, 500.00);
		cn.deposit(300);
		System.out.println(cn.getBalance());
		
	}

}
