package controller;

public class Controller 
{	
	public Controller() 
	{
		super();
	}
	
	public int Negativos (int[] vet, int tam, int neg)
	{
		
		// CONDIÇÃO DE PARADA.
		if (tam == 0) 
		{ 
			return neg;
		}
		
		else 
		{	
			if(vet[tam-1] < 0)
			{
				neg = neg + 1;
			}
			return Negativos(vet, tam-1, neg);
		}
	}
}