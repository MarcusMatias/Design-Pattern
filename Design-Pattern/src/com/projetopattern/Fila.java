package com.projetopattern;

import java.util.ArrayList;
import java.util.List;
/*
 * 1)Qual “Design Pattern” deveria ser usado para resolver este problema? R: Singleton.
 * 2)Qual propósito deste Pattern? R: permitir que um objeto tenha apenas uma única instância.
 * 3)O que é “lazy initialization”? R: quando a inicialização só acontece quando solicitada, "quando pedida", e não automaticamente.
 * 4)Implemente a classe descritano diagrama usando o “pattern” identificado no item “a”. Certifique-se que apenas uma instância da classe “Fila” pode ser criada.Esta  classedeve  ser  preferencialmente implementada  em Java  mas  podem  ser  usadas  outras linguagens  orientadas  aobjetode  sua preferência.Sua versãodesta classe deve ser colocada em um repositório publico do GitHub cujo o link deve ser submetido como resposta desta atividade.
 */


public class Fila {
	
	//Início Singleton
	private static Fila instancia; 
	
	private List<String> documentos;
	
	private Fila()
	{
		documentos = new ArrayList();
	}
	
	public static Fila getInstancia()
	{
		if(instancia != null)
		{
			instancia = new Fila();
		}
		return instancia;
	}
	//Final Singleton
	
	//Métodos da Fila
	public void imprimeDocumento(String docadic)
	{
		int encontrado = 0;
		for (String documento : documentos)
		{
			if(documento == docadic)
			{
				encontrado = 1;
			}
		}
		if(encontrado == 1)
		{
			documentos.add(docadic);
			System.out.println("Documento " + docadic + "adicionado a fila de impressão. *bzzz bzz bzz bzzzz*");
		}
		else
		{
			System.out.println("Documento " + docadic + " não encontrado na fila.");
		}
		
	}
	
	public void removeDocumento(String docremov)
	{
		int encontrado = 0;
		for (String documento : documentos)
		{
			if(documento == docremov)
			{
				encontrado = 1;
			}
			
		}
		if(encontrado == 1)
		{
			documentos.remove(docremov);
			System.out.println("Documento " + docremov + " removido da fila de impressão. *bzzz bzz bzz bzzzz*" );
		}
		else
		{
			System.out.println("Documento " + docremov + " não encontrado na fila.");
		}
	}
	
}
