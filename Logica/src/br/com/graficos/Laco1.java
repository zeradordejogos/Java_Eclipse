package br.com.graficos;

import javax.swing.JOptionPane;

import br.com.classes.Fornecedor;

public class Laco1 {

	public static void main(String[] args) {
		
		/*
		 * A estrutura de repetição e dividida em quatro partes
		 * 1 - Inicio da Variável
		 * 2 - Condição para repetição 
		 * 3 - Incrementação | Decrementação => ++ | -- | += | -=
		 * 4 - O  corpo da estrutura de repetição
		 */
		
		/*
		 * for(int i = 1; i <= 10; i++)
		 * System.out.println(i);
		 */
		
		/*int celular = 1;
		while(celular <= 10){
			System.out.println(celular);
			celular++;
		}*/
		
		/*
		int c = 10;
				
		do {
			System.out.println(c);
			c--;
		}while(c > 20);
			*/
		
		/*String palavra = "";
		
		while(!palavra.equals("fim")){
		 	palavra = JOptionPane.showInputDialog("digite a palavra secreta");
			
			
			
		}*/
		
		Fornecedor f = new Fornecedor();
		f.setId(12);
		f.setRazaoSocial("Bauduco");
		f.setTelefone("2222-2222");
		
		Categoria c = new Categoria();
		
			
		
		
	}

}
