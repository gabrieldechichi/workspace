package com.pratica.um;

public class Main {
	
	public static void main(String args[])
	{
		Aluno a = new Aluno();
		
		a.lerDados();		
		a.mostrarDados();
		
		Curso c = new Curso();
		c.lerDados();
		c.mostrarDados();
		
		Disciplina d = new Disciplina();
		d.lerDados();
		d.mostrarDados();
		
		Funcionario f = new Funcionario();
		f.lerDados();
		f.mostrarDados();
		
		Professor p = new Professor();
		p.lerDados();
		p.mostrarDados();
		
		Tecnico t = new Tecnico();
		t.lerDados();
		t.mostrarDados();
		
	}
}
