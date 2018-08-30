package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import view.*;
import controller.*;


public class GuiController{

    public static void startnow(){
		final JFrame window =new JFrame("Swing");
		JButton button1, button2;

		button1 = new JButton("Create New Hero");
		button1.setBounds(220,100,200,40);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
				Graphic.newPlayer();  
				window.dispose();
			}
		});
	
		button2 = new JButton("Select Existing Hero");
		button2.setBounds(220,200,200, 40);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
				SelectHero.graphic();
				window.dispose();  
			}
		}); 

		window.add(button1);//adding button in JFrame 
		window.add(button2);
        window.setSize(600,500);//400 width and 500 height 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
		window.setLayout(null);//using no layout managers  
		window.setVisible(true);//making the frame visible 

	}
}