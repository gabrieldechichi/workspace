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
		
		System.out.println("Digite o nome do funcion�rio: ");
		nome = s.nextLine();
		
		System.out.println("Digite o endere�o do funcion�rio: ");
		endereco = s.nextLine();
		
		System.out.println("Digite o telefone do funcion�rio: ");
		telefone = s.nextLine();
		
		System.out.println("Digite o CPF do funcion�rio: ");
		cpf = s.nextLine();
		
		System.out.println("Digite o CTPS do funcion�rio: ");
		ctps = s.nextLine();
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salario = s.nextDouble();	
		
		//s.close();		
	}
	
	public void mostrarDados()
	{
		String resposta = String.format(
				"Funcion�rio\n"
				+ "Nome: %1s\n"
				+ "Endere�o: %2s\n"
				+ "Telefone: %3s\n"
				+ "CPF: %4s\n"
				+ "CTPS: %5s\n"
				+ "Sal�rio: %6$.2f", 
				nome, endereco, telefone, cpf, ctps, salario);
		
		System.out.println(resposta);
	}

}