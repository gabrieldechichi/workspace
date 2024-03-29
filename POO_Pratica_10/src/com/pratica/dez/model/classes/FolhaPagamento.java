package com.pratica.dez.model.classes;

import java.util.ArrayList;

import com.pratica.dez.view.VisaoFuncionario;

public abstract class FolhaPagamento {
	
	private static double totalFolha = 0;
	
	public static void somaFolha(ArrayList<? extends Funcionario> funcionarios)
	{
		totalFolha = 0;
		for(Funcionario func: funcionarios)
		{
			totalFolha += func.calcSalario();
			System.out.printf("\n Nome: %s\n Salario: %1.2f \n Categoria %s \n", 
					func.getNome(), func.calcSalario(), func.getClass().getName());
		}
	}
	
	public static double getTotalFolha()
	{
		return totalFolha;
	}
	
	public static double getTotalEncargos()
	{
		//Encargos = 33.78% sobre o sal�rio
		return totalFolha*0.3378;
	}
	
	public static double calcIRRF(Funcionario f)
	{
		double salario = f.calcSalario();
		if (salario > 3000)
		{
			return salario*.275;
		}
		if (salario > 1500)
		{
			return salario*.015;
		}
		
		return 0;
	}
	
	public static double calcINSS(Funcionario f)
	{
		return f.calcSalario()*.11;
	}
	
	public static void gerarRelatorio(ArrayList<? extends Funcionario> funcionarios)
	{
		int i = 1;
		
		System.out.println("\n### Relat�rio dos funcion�rios: ###\n\n");
		for (Funcionario f : funcionarios)
		{
			double salario = f.calcSalario();
			double irrf = calcIRRF(f);
			double inss = calcINSS(f);
			System.out.printf("##### Funcionario %d (%s): \n", i, f.getClass().getSimpleName());
			VisaoFuncionario.mostrarDados(f);
			//System.out.printf("Sal�rio do funcion�rio: R$%.2f\n",salario);
			System.out.printf("IRRF a ser pago pelo funcionario: R$%.2f\n", irrf);
			System.out.printf("INSS a ser pago pelo funcionario: R$%.2f\n", inss);
			System.out.printf("Sal�rio l�quido: R$%.2f\n", (salario - irrf - inss));
			i++;
			System.out.printf("\n\n\n");
		}
	}
}
