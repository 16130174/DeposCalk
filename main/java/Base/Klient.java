package main.java.Base;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Klient extends JFrame {
	private static final long serialVersionUID = 1;
	public static Klient frame = new Klient();
	private JPanel Klien;
	private JLabel VSum;
	private JLabel VSumKon;
	private JLabel Vproc;
	private JLabel Vsroc;
	private JTextField Summa;
	private JTextField SummaKon;
	private JTextField Sroc;
	private JTextField Proc;
	private JButton Chet;
	
public static String s;
public static double sk;
public static double st;
public static double sroc;
double rezult;  
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Klient() {
		setTitle("Калькулятор клиента");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Klien = new JPanel();
		Klien.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Klien);
		Klien.setLayout(null);
		
		VSum = new JLabel("Введите перовначальную сумму вклада, руб.");
		VSum.setBounds(20, 11, 246, 24);
		Klien.add(VSum);
		
		VSumKon = new JLabel("Введите желаемую сумму на конец срока, руб.");
		VSumKon.setBounds(20, 57, 246, 24);
		Klien.add(VSumKon);
		
		Vproc = new JLabel("Введите процентную ставку, %");
		Vproc.setBounds(20, 111, 246, 24);
		Klien.add(Vproc);
		
		Vsroc = new JLabel("Срок вашего вклада составит, мес.");
		Vsroc.setBounds(20, 211, 246, 24);
		Klien.add(Vsroc);
		
		Chet = new JButton("Рассчитать");
		Chet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Chet.setBounds(118, 149, 164, 37);
		Klien.add(Chet);
		
		Chet.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				double sk = Integer.parseInt(SummaKon.getText());
				double s = Integer.parseInt(Summa.getText());
				double st = Integer.parseInt(Proc.getText());
				double result;
					Sroc.setText(""+(result= Calk(sk,s,st)));

				};
			}
				);

		Summa = new JTextField();
		Summa.setBounds(286, 13, 138, 24);
		Klien.add(Summa);
		Summa.setColumns(10);
		Summa.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c = e.getKeyChar();
				if ( (c < '0') || (c > '9') ) {
					e.consume();
			}
		}});
		
		SummaKon = new JTextField();
		SummaKon.setColumns(10);
		SummaKon.setBounds(286, 59, 138, 24);
		Klien.add(SummaKon);
		SummaKon.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c = e.getKeyChar();
				if ( (c < '0') || (c > '9') ) {
					e.consume();
			}
		}});
		
		Proc = new JTextField();
		Proc.setColumns(10);
		Proc.setBounds(286, 99, 138, 24);
		Klien.add(Proc);
		Proc.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c = e.getKeyChar();
				if ( (c < '0') || (c > '9') ) {
					e.consume();
			}
		}});
		
		Sroc = new JTextField();
		Sroc.setColumns(10);
		Sroc.setBounds(286, 211, 138, 24);
		Klien.add(Sroc);
		Sroc.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c = e.getKeyChar();
				if ( (c < '0') || (c > '9') ) {
					e.consume();
			}
		}});
	}
		public double Calk( double sk,double s,double st) {
			  double sroc;
				  sroc = 12*(sk-s)/((st/100)*s);
				return sroc;
			}
			}