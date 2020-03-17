package br.com.joao.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyFirstCalculator {

	private JFrame frame;
	private JTextField value1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button8;
	private JButton button7;
	private JButton button6;
	private JButton buttonCalculate;
	private JButton button9;
	private JButton button0;
	private JButton buttonAdd;
	private JButton buttonSub;
	private JTextField value2;
	private JLabel acao;
	private JButton clear;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstCalculator window = new MyFirstCalculator();
				
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFirstCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 258, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculadora");
		
		JEditorPane editorPanel = new JEditorPane();
		editorPanel.setEditable(false);
		editorPanel.setFont(new Font("Dialog", Font.BOLD, 34));
		editorPanel.setBounds(12, 0, 212, 68);
		frame.getContentPane().add(editorPanel);
		
		value1 = new JTextField();
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setEditable(false);
		value1.setBackground(Color.WHITE);
		value1.setBorder(null);
		value1.setFont(new Font("Dialog", Font.BOLD, 20));
		value1.setBounds(34, 30, 190, 31);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		
		value2 = new JTextField();
		value2.setFont(new Font("Dialog", Font.PLAIN, 14));
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setBackground(Color.WHITE);
		value2.setBorder(null);
		value2.setEditable(false);
		value2.setBounds(110, 0, 114, 25);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
	
		
		button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value1.getText() + button1.getText());
			}
		});
		button1.setBounds(12, 80, 61, 31);
		frame.getContentPane().add(button1);
		
		
		button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value1.getText() + button2.getText());
			}
		});
		button2.setBounds(12, 126, 61, 31);
		frame.getContentPane().add(button2);
		
		button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value1.getText() + button3.getText());
			}
		});
		button3.setBounds(12, 173, 61, 31);
		frame.getContentPane().add(button3);
		
		button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value1.getText() + button4.getText());
			}
		});
		button4.setBounds(12, 219, 61, 31);
		frame.getContentPane().add(button4);
		
		button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value1.getText() + button5.getText());
			}
		});
		button5.setBounds(85, 80, 61, 31);
		frame.getContentPane().add(button5);
		
		button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value1.getText() + button8.getText());
			}
		});
		button8.setBounds(85, 219, 61, 31);
		frame.getContentPane().add(button8);
		
		button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value1.getText() + button7.getText());
			}
		});
		button7.setBounds(85, 173, 61, 31);
		frame.getContentPane().add(button7);
		
		button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value1.getText() + button6.getText());
			}
		});
		button6.setBounds(85, 126, 61, 31);
		frame.getContentPane().add(button6);
		
		buttonCalculate = new JButton("Calcular");
		buttonCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int one = Integer.parseInt(value1.getText());
				int two = Integer.parseInt(value2.getText());
				if(acao.getText().equals("+")) {
					int add = one+two;
					value2.setText(value2.getText() + " " + acao.getText() + " " + value1.getText());
					value1.setText(String.valueOf(add));
				}else if(acao.getText().equals("-")) {
					int sub = two - one;
					value2.setText(value2.getText() + " " + acao.getText() + " " + value1.getText());
					value1.setText(String.valueOf(sub));
				}
				
			}
		});
		buttonCalculate.setBounds(110, 275, 117, 25);
		frame.getContentPane().add(buttonCalculate);
		
		button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value1.getText() + button9.getText());
			}
		});
		button9.setBounds(163, 80, 61, 31);
		frame.getContentPane().add(button9);
		
		button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(value1.getText() + button0.getText());
			}
		});
		button0.setBounds(163, 126, 61, 31);
		frame.getContentPane().add(button0);
		
		buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value1.getText());
				acao.setText(buttonAdd.getText());
				value1.setText(null);
			}
		});
		buttonAdd.setBounds(163, 169, 61, 31);
		frame.getContentPane().add(buttonAdd);
		
		buttonSub = new JButton("-");
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(value1.getText());
				acao.setText(buttonSub.getText());
				value1.setText(null);
			}
		});
		buttonSub.setBounds(163, 215, 61, 31);
		frame.getContentPane().add(buttonSub);
		
		acao = new JLabel("");
		acao.setFont(new Font("Dialog", Font.BOLD, 20));
		acao.setBounds(12, 275, 32, 15);
		frame.getContentPane().add(acao);
		
		clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value1.setText(null);
				value2.setText(null);
			}
		});
		clear.setFont(new Font("Dialog", Font.BOLD, 9));
		clear.setBounds(56, 275, 42, 25);
		frame.getContentPane().add(clear);
		
	}
}
