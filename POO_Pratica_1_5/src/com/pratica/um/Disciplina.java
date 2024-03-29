package com.pratica.um;

import java.sql.Date;
import java.util.Scanner;

public class Disciplina {
	
	int codigo;
	String nome;
	int carga_horaria;
	Curso curso;
	Professor professor;
	
	public void lerDados()
	{		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome da disciplina: ");
		nome = s.nextLine();
		
		System.out.println("Digite o codigo da disciplina: ");
		codigo = s.nextInt();
		
		System.out.println("Digite a carga hor�ria da disciplina: ");
		carga_horaria = s.nextInt();
		
		//s.close();
		
		curso = new Curso();
		curso.lerDados();
		
		professor = new Professor();
		professor.lerDados();		
	}
	
	public void mostrarDados()
	{
		String resposta = String.format(
				"Disciplina\n"
				+ "Codigo: %1d\n"
				+ "Nome: %2s\n"
				+ "Carga hor�ria: %3d\n", 
				codigo, nome, carga_horaria);
		
		System.out.println(resposta);
		curso.mostrarDados();
		//professor.mostrarDados();
	}
}
