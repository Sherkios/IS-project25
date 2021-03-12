package laba4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class info_button implements ActionListener {
	static JFrame main_info = new JFrame("subversion"); // создание графического окна
	static JPanel info_panel = new JPanel(); // Панель - используется для организации компонентов в окне
@Override
public void actionPerformed(ActionEvent arg0) {
// TODO Auto-generated method stub


main_info.setTitle ("Информация");
main_info.setBounds(500,400,400,300);
main_info.setResizable(false); // фиксированный размер окна

info_panel.setLayout(null);
main_info.add(info_panel);

JLabel laba_info1 = new JLabel("ФИО и номера зачетных книжек:"); // Отображение текста или изображения
laba_info1.setBounds(60,0,300,50);
info_panel.add(laba_info1);


main_info.setSize(400,400);
main_info.setVisible(true);
}

}