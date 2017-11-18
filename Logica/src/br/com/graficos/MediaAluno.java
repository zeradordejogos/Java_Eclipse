package br.com.graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class MediaAluno extends JFrame {

	public static void main(String[] args) {
		// vamos fazer uma instancia da classe
		// JFrame que nos ajuda a construir uma janela 

		JFrame janela = new JFrame();
		janela.setTitle("Media dos Alunos"); //Barra de Titulo
		janela.setSize(400,500);//Tamanho da Janela
		janela.setLocation(10, 10);//Localiza��o em que a Janela vai abrir
		
		
		// Vamos criar as labels para (nos outros) nossa janela
		JLabel lblNome = new JLabel("Digite o Nome do Aluno:");
		JLabel lblNota = new JLabel("Digite o Nota do Aluno");
		
		//Vamos criar as caixas de texto para inserir o nome do aluno e a nota 
		JTextField txtNome = new JTextField();
		JTextField txtNota = new JTextField();
		
		//vamos criar um bot�o para exibir o resultado
		JButton btnResultado = new JButton("Resultado");
		
		
		//Vamos zerar o layout da janela. Assim podemos colocar livremente
		//os elementos na tela
		janela.setLayout(null);
		
		//setando a posi��o das labels e txts na jframe
		lblNome.setBounds(20,40,300,30);
		janela.add(lblNome);
		
		txtNome.setBounds(20,72,300,30);
		janela.add(txtNome);
		
		lblNota.setBounds(20,105,300,30);
		janela.add(lblNota);
		
		txtNota.setBounds(20,137,100,30);
		janela.add(txtNota);
		
		btnResultado.setBounds(120,240,150,45);
		janela.add(btnResultado);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setBounds(20,300,300,30);
		janela.add(lblResultado);
		
		// Vamos adcionar o codigo para o clique do bot�o
		//Para isso utilizremos a interface ActionListener
		//Vamos pegar o nome do alun e tambem  a sua nota
		//para a nota, iremos colocar no if... else if.. else
		//e exibir o resultado na caixa resultado(lblResultado)
		
		btnResultado.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				double nota = Double.parseDouble(txtNota.getText());
				
				if(nota >= 7)
					lblResultado.setText("Aluno aprovado com a media de " + nota);
				else if(nota <= 4)
					lblResultado.setText("Reprovado com a media de " + nota);
				else
					lblResultado.setText("Recupera��o com a media de " + nota);
				
				
			}
			
		});
		
		janela.setVisible(true);//Exibir a Janela na Tela
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);//fechar a janela clicando no bot�o fechar
		
		
		
		
	}

}
