package com.pratica.sete.database;

import java.util.ArrayList;

import com.pratica.sete.classes.Disciplina;

public class DadosDisciplinas {
	
	private static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public static void cadastrar(Disciplina d) 
	{
		disciplinas.add(d);
		System.out.println(String.format(
				"\nTotal de disciplinas inseridas: %1s", disciplinas.size()));
	}
	
	public static void listar()
	{
		for (Disciplina disciplina: disciplinas) 
		{
			disciplina.mostrarDados();
		}		
	}
	
	public static Disciplina buscar(int codigo) 
	{

		for (Disciplina disciplina: disciplinas) 
		{
			if (disciplina.getCodigo() == codigo)
			{
				return disciplina;
			}
		}
		return null;
	}

	public static boolean excluir(int codigo)
	{
		Disciplina d = buscar(codigo);
		if (d != null) 
		{
			disciplinas.remove(d);
			return true;
		}
		
		return false;
	}
	
}
