package laba4;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека дл€ событи€ слушател€
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
// Ѕиблиотека дл€ GUI (построена на основе awt)
import javax.swing.*;
public class Image extends JComponent {
BufferedImage image;
	
	public Image ()
    {
        // ѕолучаем изображение
        try
        {
            image = ImageIO.read(new URL("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
	public void paintComponent(Graphics g)
    {
        if(image == null) return;
        
         
        // ќтображение логотипа 
        g.drawImage(image, 0, 0, 140, 80,  null);
        
    }
}
