package com.pratica.um;

import java.util.Scanner;

public class Funcionario {
	
	String nome;
	String endereco;
	String telefone;
	String cpf;
	String ctps;
	double salario;
	
	public void lerDados()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionário: ");
		nome = s.nextLine();
		
		System.out.println("Digite o endereço do funcionário: ");
		endereco = s.nextLine();
		
		System.out.println("Digite o telefone do funcionário: ");
		telefone = s.nextLine();
		
		System.out.println("Digite o CPF do funcionário: ");
		cpf = s.nextLine();
		
		System.out.println("Digite o CTPS do funcionário: ");
		ctps = s.nextLine();
		
		System.out.println("Digite o salário do funcionário: ");
		salario = s.nextDouble();	
		
		//s.close();		
	}
	
	public void mostrarDados()
	{
		String resposta = String.format(
				"Funcionário\n"
				+ "Nome: %1s\n"
				+ "Endereço: %2s\n"
				+ "Telefone: %3s\n"
				+ "CPF: %4s\n"
				+ "CTPS: %5s\n"
				+ "Salário: %6$.2f", 
				nome, endereco, telefone, cpf, ctps, salario);
		
		System.out.println(resposta);
	}

}
