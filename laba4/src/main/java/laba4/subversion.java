package laba4; //пакет Java классов

import java.awt.event.ActionListener; //библиотека для события слушателя
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {
	static JPanel main_panel = new JPanel();
	static JFrame main_GUI = new JFrame("subversion");// создание графического окна
	public subversion() {
	
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,300,420,500);
	main_GUI.setResizable(false); // фиксированный размер окна
	main_GUI.setLocationRelativeTo(null);
	
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	laba_info.setBounds(120,160,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(270,200,100,40);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("Информация"); // добавляем кнопку
	button_info.setBounds(30,200,150,40);
	ActionListener info_Listener = new info_button(); //создаем слушатель
	button_info.addActionListener(info_Listener); // добавляем слушатель к кнопке
	main_panel.add(button_info);
	
	JLabel laba_info5 = new JLabel("Введите радиус см"); // Отображение текста или изображения
	laba_info5.setBounds(30,230,300,50);
	main_panel.add(laba_info5);
	
	JLabel laba_info6 = new JLabel("Введите высоту см"); // Отображение текста или изображения
	laba_info6.setBounds(30,280,300,50);
	main_panel.add(laba_info6);
	
	JTextArea radius = new JTextArea();
	radius.setBounds(30,270,340,20);
	main_panel.add(radius);
	
	JTextArea visota = new JTextArea();
	visota.setBounds(30,320,340,20);
	main_panel.add(visota);
	// Кнопка расчета.
	JButton calc = new JButton("Рассчитать");
	calc.setBounds(30, 360, 150, 40);
	calc.addActionListener(e -> {
		if (isNumeric(radius.getText()) & isNumeric(visota.getText()) ) {
			JOptionPane.showMessageDialog(null, calculations(Double.parseDouble(radius.getText()), Double.parseDouble(visota.getText())) + " см");
		} else {
			JOptionPane.showMessageDialog(null, "Введены не верные данные");
		}
		
	});
	main_panel.add(calc);
	
	        
	JMenuBar menuBar = new JMenuBar();  //Создание строки главного меню
	JMenuItem saveItem;
	AbstractButton saveAllItem;
	JMenu fileMenu = new JMenu("Главная");  //Создание выпадающего меню
	
	//Пункт меню Отобразить логотип УГАТУ
	saveItem = new JMenuItem("Отобразить логотип УГАТУ");
	JMenuItem logo = new  JMenuItem("Отобразить логотип УГАТУ");
	//Действие пункта Отобразить логотип УГАТУ
	saveItem.addActionListener(new ListenerLogo());
	main_panel.add(saveItem);
	
	
	//Пункт меню выход
	saveAllItem = new JMenuItem("Выход");
	//Действие пункта выход
	saveAllItem.addActionListener(new ListenerButton());
	
	//Пункт меню Загрузить файл в проект25
	
	JMenuItem fail = new JMenuItem("Загрузить файл в проект25");
	fail.addActionListener( new loadFile() );
						
	fileMenu.add(saveItem);
	fileMenu.add(saveAllItem);
	fileMenu.add(fail);
	menuBar.add(fileMenu);
		 		
	menuBar.setBounds(0,0,410,25); //Размер строки меню
	main_panel.add(menuBar);
	
	// массив с названием для combobox
	String[] name_combobox = {
            "Переместить логотип УГАТУ в верхний правый угол",
            "Переместить логотип УГАТУ в середину",
            "Переместить логотип УГАТУ в верхний левый угол",
            "Отсортировать данные в проекте25"
	  };
	//объявляем выпадающий список
	JComboBox switcher = new JComboBox(name_combobox);
	switcher.setBounds(40,130,320,30); //Размер строки меню
	switcher.addActionListener(new switcher_combobox());
	main_panel.add(switcher);
	
	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
	
	// Проверка на число
	private boolean isNumeric(String number) {
		try {
	        Double.parseDouble(number);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	// Расчеты шарового сегмента
	private double calculations(double radius, double height) {
		double ballSeg = (Math.PI * Math.pow(height, 2) * (radius  - (1/3)*height));
		return ballSeg;
	}
	
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}

}
