package laba4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class switcher_combobox implements ActionListener {
	Integer[] massOfData;
	Integer[] massOfDataUns;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JComboBox box = (JComboBox)e.getSource();
        String item = (String)box.getSelectedItem();
        switch (item) {
     case "Переместить логотип УГАТУ в верхний правый угол":
        ListenerLogo.logo.setLocation(220, 35);
  		subversion.main_panel.revalidate();
  		subversion.main_panel.repaint();
  		break;
     case "Переместить логотип УГАТУ в середину":
        ListenerLogo.logo.setLocation(120, 35);
		subversion.main_panel.revalidate();
		subversion.main_panel.repaint();
		break;
     case "Переместить логотип УГАТУ в верхний левый угол":
         ListenerLogo.logo.setLocation(20, 35);
 		subversion.main_panel.revalidate();
 		subversion.main_panel.repaint();
 		break;
     case "Отсортировать данные в проекте25":
    	 massOfDataUns = randomMassiv.randomMass();
    	 
    	 String stringMassOfDataUns = "";
    	 
    	 
    	 for (int i = 0; i < massOfDataUns.length; i++) {
 			stringMassOfDataUns = stringMassOfDataUns + " " + massOfDataUns[i]; 
 		}
    	 
    	 
    	 JFrame frameMass = new JFrame("Вывод массива");
    	 JPanel panelMass = new JPanel(null);
    	 
    	 JLabel massUnSInfo = new JLabel("исходный массив");
    	 massUnSInfo.setBounds(20, 20, 200, 30);
    	 JLabel massUnS = new JLabel(stringMassOfDataUns);
    	 massUnS.setBounds(20, 50, 200, 30);
    	 
    	 massOfData = BubbleSort.BubbleSort(massOfDataUns);
    	 String stringMassOfData = "";
    	 for (int i = 0; i < massOfData.length; i++) {
    		 stringMassOfData = stringMassOfData + " " + massOfData[i];
 		}
    	 
    	 JLabel massSInfo =new JLabel("отсортированный массив");
    	 massSInfo.setBounds(20, 80, 200, 30);
    	 JLabel massS = new JLabel(stringMassOfData);
    	 massS.setBounds(20, 110, 250, 30);
    	 
    	 JButton exitButton = new JButton("Выход");
    	 exitButton.setBounds(50,140,100,50);
    	 exitButton.addActionListener(d -> {
    		 frameMass.setVisible(false);
    	 });
    	 
    	 panelMass.add(massS);
    	 panelMass.add(massSInfo);
    	 panelMass.add(massUnS);
    	 panelMass.add(massUnSInfo);
    	 panelMass.add(exitButton);
    	 
    	 frameMass.setContentPane(panelMass);
    	 frameMass.setSize(220,250);
    	 frameMass.setLocationRelativeTo(null);
    	 frameMass.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	 frameMass.setVisible(true);
 		break;
	}
        

}
}