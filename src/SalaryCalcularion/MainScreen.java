package SalaryCalcularion;

import java.awt.*;
import javax.swing.*;

public class MainScreen extends JFrame {
	private static final long serialVersionUID = 1L;
	
	float result = 0;
	
	//PANELS
	JPanel mainScreen = new JPanel();
	JPanel mainContainer = new JPanel();
	JPanel titleContainer = new JPanel();
	JPanel labelContainer = new JPanel();
	JPanel textFieldContainer = new JPanel();
	JPanel resultContainer = new JPanel();
	JPanel buttonContainer = new JPanel();
	
	//BUTTONS
	JButton submitButton = new JButton("Calcular");
	
	//LABELS
	JLabel title = new JLabel("Cálculo Salário");
	JLabel label1 = new JLabel("Horas Trabalhadas: ");
	JLabel label2 = new JLabel("Valor/Hora: ");
	JLabel resultTitle = new JLabel("resultado: ");
	JLabel resultValue = new JLabel("  " + Float.toString(result));
	
	//TEXT FIELDS
	JTextField hoursField = new JTextField(8);
	JTextField valueField = new JTextField(8);
	
	//FONTS
	Font f1 = new Font("Calibri", Font.BOLD, 35);
	Font f2 = new Font("Calibri", Font.PLAIN, 20);
	
	public MainScreen() {
		super("Calculo Salário");
		
		setSize(500, 300);
		setLocation(150, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		mainScreen.setLayout(new BoxLayout(mainScreen, BoxLayout.PAGE_AXIS));
		mainScreen.setBackground(Color.white);
		
		title.setFont(f1);
		title.setForeground(Color.black);
		label1.setFont(f2);
		label1.setForeground(Color.black);
		label2.setFont(f2);
		label2.setForeground(Color.black);
		resultTitle.setFont(f2);
		resultValue.setForeground(Color.black);
		resultValue.setFont(f2);
		resultValue.setForeground(Color.black);
		
		titleContainer.add(title);
		titleContainer.setBackground(Color.white);
		
		labelContainer.setLayout(new BoxLayout(labelContainer, BoxLayout.Y_AXIS));
		labelContainer.add(label1);
		labelContainer.add(Box.createRigidArea(new Dimension(5, 10)));
		labelContainer.add(label2);
		labelContainer.setBackground(Color.white);
		
		hoursField.setPreferredSize( new Dimension( 8, 27 ) );
		valueField.setPreferredSize( new Dimension( 8, 27 ) );
		
		textFieldContainer.setLayout(new BoxLayout(textFieldContainer, BoxLayout.Y_AXIS));
		textFieldContainer.add(hoursField);
		textFieldContainer.add(Box.createRigidArea(new Dimension(5, 10)));
		textFieldContainer.add(valueField);
		textFieldContainer.setBackground(Color.white);
		
		resultContainer.setLayout(new BoxLayout(resultContainer, BoxLayout.Y_AXIS));
		resultContainer.add(resultTitle);
		resultContainer.add(resultValue);
		resultContainer.setBackground(Color.white);
		
		buttonContainer.add(submitButton);
		buttonContainer.setBackground(Color.white);
		
		mainContainer.add(labelContainer);
		mainContainer.add(textFieldContainer);
		mainContainer.add(Box.createRigidArea(new Dimension(20, 20)));
		mainContainer.add(resultContainer);
		mainContainer.setBackground(Color.white);
		
		submitButton.addActionListener(new Action(hoursField, valueField, resultValue));
		
		mainScreen.add(titleContainer);
		mainScreen.add(mainContainer);
		mainScreen.add(buttonContainer);
		
		add(mainScreen);
	}
	
}
