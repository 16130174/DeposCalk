package Base;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Rab extends JFrame {
	private static final long serialVersionUID = 1;
	public static Rab frame = new Rab();
	private JPanel contentPane;
	private JLabel VDate;
	private JLabel VSumm;
	private JLabel VSrok;
	private JLabel VStavka;
	private JLabel VSummaNaKon;
	private JTextField tSumm;
	private JTextField tSrok;
	private JTextField tStavka;
	private JTextField tSummNaKon;
	private JCheckBox Capitaliz;
	private JButton Chet;
	double result;
	/**
	 * Create the frame.
	 */
	public Rab() {
		setTitle("Калькулятор работника");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		VDate = new JLabel("Введите даные о вкладчике:");
		VDate.setBounds(25, 11, 185, 24);
		contentPane.add(VDate);
		
		VSumm = new JLabel("Сумма вклада, руб.");
		VSumm.setBounds(25, 46, 122, 24);
		contentPane.add(VSumm);
		
		VSrok = new JLabel("Срок вложения, мес.");
		VSrok.setBounds(25, 101, 122, 24);
		contentPane.add(VSrok);
		
		VStavka = new JLabel("Процентая ставка, %");
		VStavka.setBounds(25, 149, 122, 24);
		contentPane.add(VStavka);
		
		tSumm = new JTextField();
		tSumm.setColumns(10);
		tSumm.setBounds(167, 46, 257, 24);
		contentPane.add(tSumm);
		tSumm.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c = e.getKeyChar();
				if ( (c < '0') || (c > '9') ) {
					e.consume();
			}
		}});
		
		tSrok = new JTextField();
		tSrok.setColumns(10);
		tSrok.setBounds(165, 101, 259, 24);
		contentPane.add(tSrok);
		tSrok.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c = e.getKeyChar();
				if ( (c < '0') || (c > '9') ) {
					e.consume();
			}
		}});
		
		tStavka = new JTextField();
		tStavka.setColumns(10);
		tStavka.setBounds(167, 149, 259, 24);
		contentPane.add(tStavka);
		tStavka.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c = e.getKeyChar();
				if ( (c < '0') || (c > '9') ) {
					e.consume();
			}
		}});
		
		Capitaliz = new JCheckBox("Без ежемесячной капитализации");
		Capitaliz.setBounds(170, 182, 254, 23);
		contentPane.add(Capitaliz);
		
		VSummaNaKon = new JLabel("Итоговая сумма на конец срока, руб");
		VSummaNaKon.setBounds(25, 280, 210, 36);
		contentPane.add(VSummaNaKon);
		
		tSummNaKon = new JTextField();
		tSummNaKon.setColumns(10);
		tSummNaKon.setBounds(224, 280, 200, 36);
		contentPane.add(tSummNaKon);	
		
		Chet = new JButton("Вычислить");
		Chet.addActionListener(e -> {
			double s = Double.parseDouble((tSumm.getText( )));			//Старцев спросит "У Вас что? Заикание?"
			double sr = Double.parseDouble((tSrok.getText( )));
			double proc = Double.parseDouble((tStavka.getText( )));
			if  (Capitaliz.isSelected()==true) {
				tSummNaKon.setText(""+(result= Summa(1,s,proc,sr)));
			}
			else {
				tSummNaKon.setText(""+(result= Summa(0,s,proc,sr)));
			};
		});
		Chet.setForeground(Color.BLACK);
		Chet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Chet.setBounds(131, 212, 163, 40);
		contentPane.add(Chet);
	}
	public double Summa(int Cap_sel, double s,double p,double sr) {
		  double summa;
		  if (Cap_sel == 1){
			  summa = s+(((s*p*sr)/100)/12);
		  }
		  else {
			  summa = s*Math.pow(1+sr*p/12/100, sr);}
			return summa;
		}
}
