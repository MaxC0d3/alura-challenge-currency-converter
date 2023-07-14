package co.com.currencyConverter.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.com.currencyConverter.utils.currencyConverterOperations;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

public class ContainerCurrency extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCurrencyValue;
	private JLabel lblNewLabel_12;
	private double resultOperations;


	/**
	 * Create the frame.
	 */
	public ContainerCurrency() {
		setTitle("Conversor de monedas");
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 317);
		contentPane = new JPanel();

		startComponent();
		
		contentPane.setBackground(new Color(18, 18, 19));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
	}

	private void startComponent() {

		JComboBox valueCurrency1 = new JComboBox();
		valueCurrency1.setModel(new DefaultComboBoxModel(new String[] {"COP - Dolar", "COP - Euros", "COP - Libras Esterlinas", "COP - Yen", "COP - Won", "Dolar - COP", "Euros - COP", "Libras Esterlinas - COP", "Yen - COP", "Won - COP"}));
		valueCurrency1.setBounds(44, 131, 223, 22);
		contentPane.add(valueCurrency1);
		
		JTextArea result = new JTextArea();
		result.setBounds(44, 223, 223, 22);
		contentPane.add(result);

		lblNewLabel_12 = new JLabel("Resultado:");
		lblNewLabel_12.setFont(new Font("JetBrains Mono", Font.PLAIN, 11));
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(44, 198, 112, 14);
		contentPane.add(lblNewLabel_12);

		
		JLabel lblNewLabel = new JLabel("Conversor de monedas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(44, 29, 209, 23);
		contentPane.add(lblNewLabel);
		
		fieldCurrencyValue = new JTextField();
		fieldCurrencyValue.setBounds(44, 100, 223, 20);
		contentPane.add(fieldCurrencyValue);
		fieldCurrencyValue.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor a convertir:");
		lblNewLabel_1.setFont(new Font("JetBrains Mono", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(44, 75, 175, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnConvert = new JButton("Convertir");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					result.setText("");
					
					int indexOfValue = valueCurrency1.getSelectedIndex();
					
					currencyConverterOperations Currency = new currencyConverterOperations();
					Currency.setValue(fieldCurrencyValue.getText());
					resultOperations = Currency.convertCurrency(indexOfValue);
					
					result.setText(String.valueOf(resultOperations));
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Put a value to convert...");
				}
				
			}
		});
		btnConvert.setBounds(44, 164, 223, 23);
		contentPane.add(btnConvert);
	}
}
