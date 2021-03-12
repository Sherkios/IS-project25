package laba4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class loadFile implements ActionListener {
	static ArrayList<String> lines = new ArrayList<String>();

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("¬вод пути к фалу");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel(null);

		JLabel infoAboutPay = new JLabel("¬ведите абсолютный путь к файлу");
		infoAboutPay.setBounds(20, 20, 260, 30);
		JTextField inputPath = new JTextField();
		inputPath.setBounds(20,60,260,30);

		JButton exitButton = new JButton("¬вод");
		exitButton.setBounds(100,100,100,50);
		exitButton.addActionListener(d ->{
		frame.setVisible(false);
		try {
		Path path = Paths.get(inputPath.getText());
		BufferedReader reader = new BufferedReader(new FileReader(path.toString()));
		String line;
		lines = new ArrayList<String>();
		while ((line = reader.readLine()) != null) {
		lines.add(line);
		}
		form();
		

		} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		JOptionPane.showMessageDialog(null, e1);
		}
		});

		panel.add(infoAboutPay);
		panel.add(inputPath);
		panel.add(exitButton);

		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void form() {
		info_button.info_panel.removeAll();
		JLabel laba_info2 = new JLabel(lines.get(0));
		JLabel laba_info3 = new JLabel(lines.get(1));
		JLabel laba_info4 = new JLabel(lines.get(2));// ќтображение текста или изображени€
		laba_info2.setBounds(60,0,300,100);
		laba_info3.setBounds(60,0,300,150);
		laba_info4.setBounds(60,0,300,200);
		info_button.info_panel.add(laba_info2);
		info_button.info_panel.add(laba_info3);
		info_button.info_panel.add(laba_info4);
		info_button.info_panel.repaint();
		info_button.main_info.repaint();
	}

}

