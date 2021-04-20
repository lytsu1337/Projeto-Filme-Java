package Filme;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Filme extends JFrame {
	public void init() {
		
		JTabbedPane abas = new JTabbedPane();
		
		JPanel panelFilme = new JPanel();
		
		JLabel label = new JLabel("Título: ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font(null, Font.BOLD, 16));
		panelFilme.add(label);
		
		JTextField textFieldTitulo = new JTextField(10);
		textFieldTitulo.setBorder(BorderFactory.criar());
		panelFilme.add(textFieldTitulo);
		
		
		JLabel label1 = new JLabel("Sinopse: ");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setForeground(new Color(0, 0, 0));
		label1.setFont(new Font(null, Font.BOLD, 16));
		panelFilme.add(label1);
		
		JTextField textFieldNumero2 = new JTextField(15);
		textFieldNumero2.setPreferredSize(new Dimension(200, 60));
		textFieldNumero2.setBorder(BorderFactory.criar());
		panelFilme.add(textFieldNumero2);
		
		
		JLabel label3 = new JLabel("Gênero: ");
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setForeground(new Color(0, 0, 0));
		label3.setFont(new Font(null, Font.BOLD, 16));
		panelFilme.add(label3);
		
		String[] generos = { "Aventura", "Mistério", "Ação", "Romance" };
		panelFilme.add(new JComboBox<String>(generos));
		
		
		JLabel label2 = new JLabel("Onde Assistir: ");
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setForeground(new Color(0, 0, 0));
		label2.setFont(new Font(null, Font.BOLD, 16));
		panelFilme.add(label2);
		
		
		RadioGroup radioGroup = new RadioGroup(List.of("Netflix", "Amazon Prime", "Disney Plus", "Pirate Bay"));
		panelFilme.add(radioGroup);
		
		
		JCheckBox checkBox = new JCheckBox("Assistido");
		panelFilme.add(checkBox);
		
		
		JLabel label4 = new JLabel("Avaliação: ");
		label4.setHorizontalAlignment(JLabel.CENTER);
		label4.setForeground(new Color(0, 0, 0));
		label4.setFont(new Font(null, Font.BOLD, 16));
		panelFilme.add(label4);
		
		panelFilme.add(new StarRater(5));
		
		panelFilme.add(new JLabel(new ImageIcon("C:\\Users\\Lucas\\Pictures\\teste\\Avengers.jpg")));

		JButton buttonSalvar = new JButton ("Salvar");	
		panelFilme.add(buttonSalvar);
		
		JButton buttonCancelar = new JButton ("Cancelar");	
		panelFilme.add(buttonCancelar);
		
		
		FilmeListener listener = new FilmeListener(textFieldTitulo, textFieldNumero2);		
		
		buttonSalvar.addActionListener(listener);
		textFieldTitulo.addMouseListener(listener);
		textFieldNumero2.addMouseListener(listener);
		
		abas.add("Filmes", panelFilme);
		abas.add("Lista", new JLabel("Em breve..."));
		
		add(abas);

		setSize(680, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Filme().init();
		
		
	}

}