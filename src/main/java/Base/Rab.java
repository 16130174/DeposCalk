package Base;
/** Указываем на то, что класс принадлежит пакету */
import javax.swing.*;
/**  Подключаем библиотеки для создания графического интерфейса для программ  */
import javax.swing.border.EmptyBorder;
/** Импортируем библиотеку для создания пустой рамки, которая позволяет создать отступы вокруг панели */
import java.awt.*;
/** Импортируем библиотеки оконно - графического интерфейса */
import java.awt.event.*;
/** Импортируем библиотеку интерфейса ActionListener */

public class Rab extends JFrame {
	/** Создаем класс, наследуемый от класса JFrame */
	public static Rab frame = new Rab();
	/** Задаем переменную для формы калькулятора клиента */
	private JPanel contentPane;
	/** Задаем переменную панели */
	private JLabel VDate, VSumm, VSrok, VStavka,VSummaNaKon;
	/** Задаем переменные JLabel */
	private JTextField tSumm,tSrok, tStavka, tSummNaKon;
	/** Задаем переменные текстовых полей */
	private JCheckBox Capitaliz;
	/** Задаем переменную чекбокса */
	private JButton Chet;
	/** Задаем переменную кнопки */
	double result;
	double s;
	double sr;
	double proc;
	/** Обьъявляем переменные и их тип данных
	 * s - Первоначальная сумма
	 * sr - Срок вложения
	 * proc - Процентная ставка
	 * result - Результат вычислений */
	/**
	 * Create the frame.
	 */
	public Rab() {
		/** Создаем форму калькулятора работника */
		setTitle("Калькулятор работника");
		/** Задаем название формы */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/** Определяем способ закрытия формы */
		setBounds(100, 100, 450, 370);
		/** Задаем расположение и размеры формы (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane = new JPanel();
		/**  Обьявляем форму */
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		/** Создаем граничные отступы (сверху, слева, снизу, справа) */
		setContentPane(contentPane);
		/** Заменяем панель содержимого окна, для возможности использование панелей класса JPanel */
		contentPane.setLayout(null);
		/** Запрещаем использование предусмотренного по умолчанию механизма управления размещения компонентнов
		 * Используем для самостоятельного размещения компонентов */
		
		VDate = new JLabel("Введите даные о вкладчике:");
		/** Задаем название JLabel */
		VDate.setBounds(25, 11, 185, 24);
		/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(VDate);
		/** Добавляем JLabel на панель */
		
		VSumm = new JLabel("Сумма вклада, руб.");
		/** Задаем название JLabel */
		VSumm.setBounds(25, 46, 122, 24);
		/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(VSumm);
		/** Добавляем JLabel на панель */
		
		VSrok = new JLabel("Срок вложения, мес.");
		/** Задаем название JLabel */
		VSrok.setBounds(25, 101, 122, 24);
		/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(VSrok);
		/** Добавляем JLabel на панель */
		
		VStavka = new JLabel("Процентая ставка, %");
		/** Задаем название JLabel */
		VStavka.setBounds(25, 149, 122, 24);
		/** Задаем расположение и размеры JLabel (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(VStavka);
		/** Добавляем JLabel на панель */
		
		tSumm = new JTextField();
		/** Объявляем текстовое поле */
		tSumm.setColumns(10);
		/** Задаем длину строки*/
		tSumm.setBounds(167, 46, 257, 24);
		/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(tSumm);
		/** Добавляем текстовое поле на панель */
		tSumm.addKeyListener(new KeyAdapter() {
			/** Добавляем слушателя */
			   public void keyTyped(KeyEvent e) {
				   /** Метод вызывается, когда пользователь нажимает клавиши на клавитуре */
				      char c = e.getKeyChar();
				      /** Возвращает введенный с клавиатуры символ и присваивает его переменной с */
				      if ( ((c < '0') || (c > '9'))) {
				    	  /** Указываем условия */
				    	 final JPanel panel = new JPanel();
				    	 /**Объялвяем панель */
						 JOptionPane.showMessageDialog(panel,"Введен недопустимый символ!", "Ошибка", JOptionPane.ERROR_MESSAGE);
						 /** Выводим сообщение об ошибке, если введены символы, отличные от чисел */
				         e.consume(); 
				         /** игнорируем введенные буквы и пробел */
				      }
				   }
				});
		
		tSrok = new JTextField();
		/** Объявляем текстовое поле */
		tSrok.setColumns(10);
		/** Задаем длину строки*/
		tSrok.setBounds(165, 101, 259, 24);
		/** Задаем расположение и размеры текстового поля (расположение по x, расположение по y, высота, ширина (в пикселях)) */
		contentPane.add(tSrok);
		/** Добавляем текстовое поле на панель */
		tSrok.addKeyListener(new KeyAdapter() {
			/** Добавляем слушателя */
			   public void keyTyped(KeyEvent e) {
				   /** Метод вызывается, когда пользователь нажимает клавиши на клавитуре */
				      char c = e.getKeyChar();
				      /** Возвращает введенный с клавиатуры символ и присваивает его переменной с */
				      if ( ((c < '0') || (c > '9'))) {
				    	  /** Указываем условия */
				    	 final JPanel panel = new JPanel();
				    	 /**Объялвяем панель */
						 JOptionPane.showMessageDialog(panel,"Введен недопустимый символ!", "Ошибка", JOptionPane.ERROR_MESSAGE);
						 /** Выводим сообщение об ошибке, если введены символы, отличные от чисел */
				         e.consume(); 
				         /** игнорируем введенные буквы и пробел */
				      }
				   }
				});
		
		tStavka = new JTextField();
		tStavka.setColumns(10);
		tStavka.setBounds(167, 149, 259, 24);
		contentPane.add(tStavka);
		tStavka.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
				      char c = e.getKeyChar();
				      if ( ((c < '0') || (c > '9'))) {
				         e.consume();  // игнорим введенные буквы и пробел
				      }
				   }
				});
		
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
				/** Присваиваем текстовому полю полученное значение */
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
