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
			 * e ele subtrai ate 0, o indice 0 do fibonaci deve ser 1
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
		 * o primeiro valor se torna a soma dos dois, como comeca com 0 a soma originalmente e 1, 
                    mas avanca para 1+1=2, 2+1 = 3..... O segundo valor se torna o primeiro, que comecou maior e
		    depois se tornou a soma, o indice subtrai ate 0
   
		 */
	}
	
		}}
