package Filme;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FilmeListener implements ActionListener, MouseListener {
	
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtEstrela;


	public FilmeListener(JTextField txtNumero1, JTextField txtNumero2) {
		this.txtNumero1 = txtNumero1;
		this.txtNumero2 = txtNumero2;
		//this.txtEstrela = txtEstrela;
		
	}

	// public FilmeListener(JTextField textFieldTitulo, JTextField textFieldNumero2) {
		// TODO Auto-generated constructor stub
	//}

	@Override
	public void actionPerformed(ActionEvent e) {
		String numero1 = String.valueOf(txtNumero1.getText()) ;
		String numero2 = String.valueOf(txtNumero2.getText()) ;
		
		JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
		System.out.println("Seu cadastro contém os seguintes dados:");
		System.out.println("Título: " + numero1);
		System.out.println("Sinopse: " + numero2);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		txtNumero1.setBackground(Color.GRAY);
		txtNumero2.setBackground(Color.GRAY);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		txtNumero1.setBackground(Color.WHITE);
		txtNumero2.setBackground(Color.WHITE);

	}
	
	

}