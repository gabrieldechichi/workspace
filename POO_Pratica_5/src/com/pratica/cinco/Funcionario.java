package com.pratica.cinco;

import java.util.Scanner;

public abstract class Funcionario extends Pessoa {
	
	private String endereco;
	private String telefone;
	private String ctps;
	private double salarioBase;
	
	public abstract double calcSalario();
	
	public String getEndereco() {
		return endereco;
	}

	public boolean setEndereco(String endereco) {
		if (endereco.length() > 0)
		{
			this.endereco = endereco;
			return true;
		}
		
		System.out.println("Endere�o inv�lido!");
		return false;
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean setTelefone(String telefone) {
		if (telefone.length() > 0)
		{
			this.telefone = telefone;
			return true;
		}
		
		System.out.println("Telefone inv�lido!");
		return false;
	}

	public String getCtps() {
		return ctps;
	}

	public boolean setCtps(String ctps) {
		if (ctps.length() > 0)
		{
			this.ctps = ctps;
			return true;
		}
		
		System.out.println("CTPS inv�lido!");
		return false;
	}

	protected double getSalarioBase() {
		return salarioBase;
	}

	public boolean setSalarioBase(double salario) {
		if (salario >= 0)
		{
			this.salarioBase = salario;
			return true;
		}
		
		System.out.println("Sal�rio inv�lido!");
		return false;
	}

	public void lerDados()
	{
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o endere�o do funcion�rio: ");
		while(!setEndereco(s.nextLine()));
		
		System.out.println("Digite o telefone do funcion�rio: ");
		while(!setTelefone(s.nextLine()));
		
		System.out.println("Digite o CTPS do funcion�rio: ");
		while(!setCtps(s.nextLine()));
		
		System.out.println("Digite o Sal�rio Base do funcion�rio: ");
		while(!setSalarioBase(s.nextDouble()));	
	}
	
	public void mostrarDados()
	{
		super.mostrarDados();
		
		String resposta = String.format(
				"Endere�o: %1s\n"
				+ "Telefone: %2s\n"
				+ "CTPS: %3s\n"
				+ "Sal�rio: %4$.2f", 
				getEndereco(), getTelefone(), getCtps(), calcSalario());
		
		System.out.println(resposta);
	}

}
