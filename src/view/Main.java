package view;

import controller.Controller;

public class Main 
{
	public static void main(String[] args) 
	{		
		Controller c = new Controller();
		int[] vet = {-5,5,3,-6,4};
		int tam = vet.length;
		int negs = 0;
		int totN = c.Negativos(vet, tam, negs);
		System.out.println("O total de negativos é: " + totN);
			
	}	
}