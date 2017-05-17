package com.pratica.tres;

import java.util.Scanner;

public class Aluno extends Pessoa {
	
	private String matricula;
	private Curso curso;
	private byte situacao;
	
	public String getMatricula() {
		return matricula;
	}

	public boolean setMatricula(String matricula) {
		if (matricula.length() > 0)
		{
			this.matricula = matricula;
			return true;
		}
		
		System.out.println("Matr�cula inv�lido!");
		return false;
	}

	public Curso getCurso() {
		return curso;
	}

	public boolean setCurso(Curso curso) {
		if (curso != null)
		{
			this.curso = curso;
			return true;
		}
		
		System.out.println("Curso inv�lido!");
		return false;
	}

	public String getSituacao() {
		String[] situacaoRespostas= new String[] { 
				"N�o indicado", "Matriculado", "Trancado", "Desligado" };
		
		if (situacao > situacaoRespostas.length - 1)
		{
			situacao = 0;
		}
		
		return situacaoRespostas[situacao];
	}

	public boolean setSituacao(char situacao) {
		char[] situacaoSiglas = new char[] { 'M', 'T', 'D'};
		this.situacao = 0;
		for (int i = 0; i < situacaoSiglas.length; i++)
		{
			if (situacaoSiglas[i] == situacao)
			{
				this.situacao = (byte) (i+1);
				return true;
			}
		}
		
		System.out.println("Situa��o inv�lida. Favor enviar 'M', 'T' ou 'D'.");
		return false;
	}
	
	public boolean setSituacao(String situacao)
	{
		if (situacao.length() == 0)
		{
			return false;
		}
		
		return setSituacao(situacao.charAt(0));
	}

	public void lerDados()
	{		
		super.lerDados();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a matr�cula do aluno: ");
		while(!setMatricula(s.nextLine()));
		
		System.out.println("Digite a situa��o do aluno ('M', 'T' ou 'D'): ");
		while(!setSituacao(s.nextLine()));
		
		setCurso(new Curso());
		
		getCurso().lerDados();		
	}
	
	public void mostrarDados()
	{
		super.mostrarDados();
		
		String resposta = String.format(
				"Matricula: %1s\n"
				+ "Situa��o: %2s\n"
				+ "\nCurso:", 
				getMatricula(), getSituacao());
		
		System.out.println(resposta);
		curso.mostrarDados();
	}
	
}
