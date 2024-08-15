package controller;

public class Fibo {

	public Fibo() {
		super();}
	
	public int seqFib(int numA,int numB, int i, String serie) {
		if (i==0) {
			if(numB==0) {
				
				return 1;
			}
			/*
			 * condicao de parada, o indice e o numero inserido pelo usuario
			 * e ele subtrai ate 0
			 */
			serie= serie.substring(1);
			// gambiarra, nao sei fazer sem virgula
			System.out.println(serie);
			return( numB);
		}
	   else {
		
		serie= serie + "," + String.valueOf(numA) ;
		
			
		return seqFib(numB+numA, numA, i-1, serie);
		/*
		 * 
		 */
	}
	
		}}
