package com.pratica.um;

import java.util.Scanner;

public class Tecnico {
	
	String cargo;
	String departamento;
	
	public void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o cargo do t�cnico: ");
		cargo = s.nextLine();
		
		System.out.println("Digite o departamento do t�cnico: ");
		departamento = s.nextLine();
		
		//s.close();		
	}
	
	public void mostrarDados()
	{
		String resposta = String.format(
				"T�cnico\n"
				+ "Cargo: %1s\n"
				+ "Departamento: %2s\n", 
				cargo, departamento);
		
		System.out.println(resposta);
	}
}
