package view;
import javax.swing.JOptionPane;

import controller.Fibo;

public class Principal {

	public static void main(String[] args) {
		
 Fibo fi= new Fibo();
	String sequencia= "";
    int numA=1;
	int indice= Integer.parseInt(JOptionPane.showInputDialog(" qual a posicao da serie desejada?"));
	int numB=0;
	int resp= fi.seqFib( numA, numB, indice, sequencia);
	System.out.println(resp);
	
	
}
}
