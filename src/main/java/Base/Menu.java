package Base;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

public class Menu extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ActionListener e;
	String login="admin";
	String password="2007";
	String login_kl="user"; 
	String password_kl="7000";
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Создаем форму
	 */
	public Menu() {
		setTitle("Меню");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel text = new JLabel("Введите логин:");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton Rab = new JToggleButton("Работник");
		Rab.setBounds(28, 23, 152, 49);
		contentPane.add(Rab);
		Rab.setBackground(new Color(200,250,250));
		
		JToggleButton Klient = new JToggleButton("Клиент");
		Klient.setBounds(272, 23, 152, 49);
		contentPane.add(Klient);
		Klient.setBackground(new Color(200,250,250));
		ButtonGroup group = new ButtonGroup();
		group.add(Rab);
		group.add(Klient);
		JLabel label = new JLabel("Введите логин");
		label.setBounds(28, 105, 152, 34);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Введите пароль");
		label_1.setBounds(28, 165, 152, 34);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(247, 105, 177, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(247, 165, 177, 34);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Войти");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Rab.isSelected()){
					 if(textField.getText().equals(login)) {
							
							if(textField_1.getText( ).equals(password)) {
							new Rab().show();
							setVisible(false);
							}else {final JPanel panel = new JPanel();
							JOptionPane.showMessageDialog(panel,"Логин или пароль введены неверно!", "Ошибка", JOptionPane.ERROR_MESSAGE);
							textField.setText("");
							textField_1.setText("");}
							
						}else {final JPanel panel = new JPanel();
						JOptionPane.showMessageDialog(panel,"Логин или пароль введены неверно!", "Ошибка", JOptionPane.ERROR_MESSAGE);
						textField.setText("");
						textField_1.setText("");}
			}
			
				if (Klient.isSelected()) {
					 if(textField.getText().equals(login_kl)) {
							
							if(textField_1.getText( ).equals(password_kl)) {
							new Klient().show();
							setVisible(false);
							}else {final JPanel panel = new JPanel();
							JOptionPane.showMessageDialog(panel,"Логин или пароль введены неверно!", "Ошибка", JOptionPane.ERROR_MESSAGE);
							textField.setText("");
							textField_1.setText("");}
							
						} else {final JPanel panel = new JPanel();
						JOptionPane.showMessageDialog(panel,"Логин или пароль введены неверно!", "Ошибка", JOptionPane.ERROR_MESSAGE);
						textField.setText("");
						textField_1.setText("");}
				}
			}
		});
		btnNewButton.setBounds(168, 210, 93, 34);
		btnNewButton.setBackground(new Color(150,70,130));
		contentPane.add(btnNewButton);
		/**
		 * Определяем размер кнопки
		 * Определяем цвет кнопки
		 * Добавляем кнопку на панель
		 */
	}
}
