package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Franklin Gothic Book", Font.ITALIC, 27));
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		textField.setBounds(20, 48, 296, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 240, 245));
		btn7.setForeground(Color.RED);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btn7.setBounds(20, 185, 65, 62);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 240, 245));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setForeground(Color.RED);
		btn8.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btn8.setBounds(95, 185, 65, 62);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 240, 245));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setForeground(Color.RED);
		btn9.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btn9.setBounds(170, 185, 65, 62);
		frame.getContentPane().add(btn9);
		
		JButton btnmultiply = new JButton("X");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnmultiply.setBackground(new Color(255, 240, 245));
		btnmultiply.setForeground(Color.RED);
		btnmultiply.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btnmultiply.setBounds(245, 185, 65, 62);
		frame.getContentPane().add(btnmultiply);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 240, 245));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(Color.RED);
		btn4.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btn4.setBounds(20, 257, 65, 62);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 240, 245));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setForeground(Color.RED);
		btn5.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btn5.setBounds(95, 257, 65, 62);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 240, 245));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setForeground(Color.RED);
		btn6.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btn6.setBounds(170, 257, 65, 62);
		frame.getContentPane().add(btn6);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btndivide.setBackground(new Color(255, 240, 245));
		btndivide.setForeground(Color.RED);
		btndivide.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btndivide.setBounds(245, 257, 65, 62);
		frame.getContentPane().add(btndivide);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 240, 245));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(Color.RED);
		btn1.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btn1.setBounds(20, 329, 65, 62);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 240, 245));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setForeground(Color.RED);
		btn2.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btn2.setBounds(95, 329, 65, 62);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 240, 245));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setForeground(Color.RED);
		btn3.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btn3.setBounds(170, 329, 65, 62);
		frame.getContentPane().add(btn3);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnminus.setBackground(new Color(255, 240, 245));
		btnminus.setForeground(Color.RED);
		btnminus.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btnminus.setBounds(245, 329, 65, 62);
		frame.getContentPane().add(btnminus);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnplus.setBackground(new Color(255, 240, 245));
		btnplus.setForeground(Color.RED);
		btnplus.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btnplus.setBounds(245, 401, 65, 62);
		frame.getContentPane().add(btnplus);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else {
					textField.setText("Invalid Input");
				}
			}
		});
		btnequal.setBackground(Color.YELLOW);
		btnequal.setForeground(Color.RED);
		btnequal.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btnequal.setBounds(170, 401, 65, 62);
		frame.getContentPane().add(btnequal);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setBackground(new Color(255, 240, 245));
		btndot.setForeground(Color.RED);
		btndot.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btndot.setBounds(95, 401, 65, 62);
		frame.getContentPane().add(btndot);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 240, 245));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setForeground(Color.RED);
		btn0.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btn0.setBounds(20, 401, 65, 62);
		frame.getContentPane().add(btn0);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setForeground(Color.RED);
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 37));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace = str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setBackground(new Color(255, 240, 245));
		btnBackspace.setBounds(21, 128, 140, 47);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tw Cen MT", Font.BOLD, 37));
		btnClear.setForeground(Color.RED);
		btnClear.setBackground(new Color(255, 240, 245));
		btnClear.setBounds(170, 128, 146, 47);
		frame.getContentPane().add(btnClear);
		frame.setBounds(100, 100, 355, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
