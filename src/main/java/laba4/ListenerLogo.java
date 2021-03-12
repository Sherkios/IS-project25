package laba4;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека дл€ событи€ слушател€
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
// Ѕиблиотека дл€ GUI (построена на основе awt)
import javax.swing.*;
//класс реализующий слушатель (ожидани€ нажати€ кнопки)
public class ListenerLogo  implements ActionListener {
		static Image logo = new Image(); //«агрузка логотипа 
		@Override // ключевое слово, которое позвол€ет в дочернем классе заново создать реализацию метода родительского класса
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
				
			
		logo.setSize(140,80);
		logo.setLocation(220, 35);
		subversion.main_panel.add(logo);
		subversion.main_panel.revalidate();
		subversion.main_panel.repaint();
		}
		
		}

