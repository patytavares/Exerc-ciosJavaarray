package Anayr;

import java.util.Scanner;

public class Exercicio3array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 float [][] valor = new float [3][3];
	     int linha=0,coluna=0,cont=0;

	     Scanner leia = new Scanner(System.in);

	     for(linha=0;linha<3;linha++)
	     {

	         for(coluna=0;coluna<3;coluna++)
	         {
	             System.out.println("\n digite um valor: ");
	             valor[linha][coluna] = leia.nextFloat();

	             if(valor[linha][coluna]>10)
	             {
	                 cont++;
	             }
	         }
	     }

	     System.out.println("\n Os valores maiores que 10 ser�o: "+cont);
	}

 }



