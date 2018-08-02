package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Graphic {
	JFrame f;  
	public Graphic(){  
	f=new JFrame();//creating instance of JFrame 
	
    JFrame f=new JFrame("Swing");  
    final JTextField text1, text2;
    text1=new JTextField();  
    text1.setBounds(50,50, 150,200);
    
    text2=new JTextField(); 
    text2.setBounds(300,50, 150,200);
    
    JLabel label = new JLabel("Available hero's");  
    label.setBounds(50,15, 100,30);
    
    JLabel label2 = new JLabel("Hero stats");  
    label2.setBounds(300,15, 100,30);
	          
	JButton button1, button2;
	button1 = new JButton("Select hero");//creating instance of JButton
	button1.setBounds(100,300,100, 40);
	
	button2 = new JButton("New hero");
	button2.setBounds(250,300,100, 40);

	button1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){  
		text1.setText("Welcome to Javatpoint.");  
    }  
});
	
	          
	f.add(button1);//adding button in JFrame 
	f.add(button2);
	f.add(text1);
	f.add(text2);
	f.add(label);
	f.add(label2);
	          
	f.setSize(400,500);//400 width and 500 height  
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible  
	}
  


}
