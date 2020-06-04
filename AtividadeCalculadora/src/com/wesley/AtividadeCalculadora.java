package com.wesley;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtividadeCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField display;
	private int leitura;
    private int memoria;
    private char operacao;
	
    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					AtividadeCalculadora frame = new AtividadeCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		 
	}

	/**
	 * Create the frame.
	 */
	public AtividadeCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		leitura = 0;
		memoria = 0;
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(0, 70, 74, 50);
		contentPane.add(btn7);
		btn7.setText("7");
		getContentPane().add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(0, 121, 74, 50);
		contentPane.add(btn6);
		btn6.setText("6");
		getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(0, 170, 74, 50);
		contentPane.add(btn3);
		btn3.setText("3");
		getContentPane().add(btn3);
		
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(0, 217, 74, 50);
		contentPane.add(btn0);
		btn0.setText("0");
		getContentPane().add(btn0);
		
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(74, 70, 74, 50);
		contentPane.add(btn8);
		btn8.setText("8");
		getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(148, 70, 74, 50);
		contentPane.add(btn9);
		btn9.setText("9");
		getContentPane().add(btn9);
		
		JButton btndividir = new JButton("/");
		btndividir.setBounds(224, 70, 74, 50);
		contentPane.add(btndividir);
		btndividir.setText("/");
		getContentPane().add(btndividir);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(74, 121, 74, 50);
		contentPane.add(btn5);
		btn5.setText("5");
		getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(148, 121, 74, 50);
		contentPane.add(btn4);
		btn4.setText("4");
		getContentPane().add(btn4);
		
		JButton btnmultiplicar = new JButton("*");
		btnmultiplicar.setBounds(224, 121, 74, 50);
		contentPane.add(btnmultiplicar);
		btnmultiplicar.setText("*");
		getContentPane().add(btnmultiplicar);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(74, 170, 74, 50);
		contentPane.add(btn2);
		btn2.setText("2");
		getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(148, 170, 74, 50);
		contentPane.add(btn1);
		btn1.setText("1");
		getContentPane().add(btn1);
		
		JButton btnsomar = new JButton("+");
		btnsomar.setBounds(224, 170, 74, 50);
		contentPane.add(btnsomar);
		btnsomar.setText("+");
		this.add(btnsomar);
		
		JButton btnponto = new JButton(".");
		btnponto.setBounds(74, 217, 74, 50);
		contentPane.add(btnponto);
		btnponto.setText(".");
		this.add(btnponto);
		
		JButton btnigual = new JButton("=");
		btnigual.setBounds(148, 217, 74, 50);
		contentPane.add(btnigual);
		btnigual.setText("=");
		this.add(btnigual);
		
		
		JButton btnsubtrair = new JButton("-");
		btnsubtrair.setBounds(224, 217, 74, 50);
		contentPane.add(btnsubtrair);
		btnsubtrair.setText("-");
		this.add(btnsubtrair);
		
		display = new JTextField();
		display.setBounds(0, 39, 298, 20);
		getContentPane().add(display);
		contentPane.add(display);
		display.setColumns(10);
		
		btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 7;
               
                display.setText(display.getText() + "7");
            }
        });
		
		btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 6;
              
                display.setText(display.getText() + "6");
            }
        });
		
		btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 8;
                display.setText(display.getText() + "8");
            }
        });
		
		btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 9;
                display.setText(display.getText() + "9");
            }
        });
		
		btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 5;
                display.setText(display.getText() + "5");
            }
        });
		
		btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 4;
                display.setText(display.getText() + "4");
            }
        });
		
		btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 3;
                display.setText(display.getText() + "3");
            }
        });
		
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 2;
                display.setText(display.getText() + "2");
            }
        });
		
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 1;
                display.setText(display.getText() + "1");
            }
        });
		
		btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 0;
                display.setText(display.getText() + "0");
            }
        });
		
		
		
		btnsomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '+';
                memoria += leitura;
                leitura = 0;
                display.setText("");
            }
        });
		
		btnsubtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '-';
                memoria += leitura;
                leitura = 0;
                display.setText("");
            }
        });
		
		btndividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '/';
                memoria += leitura;
                leitura = 0;
                display.setText("");
            }
        });
		
		
		btnmultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '*';
                memoria += leitura;
                leitura = 0;
                display.setText("");
            }
        });
		
		 btnigual.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                switch (operacao) {
	                    case '+': {
	                        memoria += leitura;
	                        break;
	                    }
	                    case '-':{
	                    	memoria -= leitura;
	                    	break;
	                    }
	                    case '/':{
	                    	memoria /= leitura;
	                    	break;
	                    }
	                    case '*':{
	                    	memoria *= leitura;
	                    	break;
	                    }
	                
	                }
	                
	                
	                
	                leitura = 0;
	                display.setText("" + memoria);
	            }
	        });
	
	}

	
	

}
