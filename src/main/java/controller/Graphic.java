package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.*;
import java.util.Scanner;
import main.*;
import view.*;
import model.*;
import util.*;
import java.awt.GridBagConstraints;

public class Graphic {
	static JFrame f; 
	public static void startnow(){
		final JFrame window =new JFrame("Swing");
		JButton button1, button2;

		button1 = new JButton("Create New Hero");
		button1.setBounds(100,100,200,40);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
				newPlayer();  
				window.dispose();
			}
		});
	
		button2 = new JButton("Select Existing Hero");
		button2.setBounds(100,200,200, 40);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
				newPlayer();
				window.dispose();  
			}
		}); 

		window.add(button1);//adding button in JFrame 
		window.add(button2);
		window.setSize(600,500);//400 width and 500 height  
		window.setLayout(null);//using no layout managers  
		window.setVisible(true);//making the frame visible 

	}
	
	public static void newPlayer() {
		final JFrame f= new JFrame("Create New Hero");  
		final JTextField tf=new JTextField("Enter Name");  
		  //tf.setText("power");
		   tf.setBounds(100,60, 150,20);  
		   final JButton button=new JButton("OK");  
		   button.setBounds(120,80,95,30);  
		   button.addActionListener(new ActionListener(){  
	   public void actionPerformed(ActionEvent e){
				String name = tf.getText();
				graphic(name);
				f.dispose();
			   }  
		   });
		   f.add(button);  
		   f.add(tf);
		   f.setSize(600,500);  
		   f.setLayout(null);  
		   f.setVisible(true);
	}

	public static void graphic(String name){ 
		
	f=new JFrame();//creating instance of JFrame 
	
	JFrame f=new JFrame("Swing");
	JPanel panel = new JPlane(new GridBagLayout()); 
	String[] heroTypes = {"1. ELF ", "2. Flash", "3. Knight", "4. Supergirl", "5. Wizard"};
	int index = 0;
	JList list = new JList(heroTypes);
	GridBagConstraints cc = new GridBagConstraints();
	list.setSelectedIndex(index);
	
	cc.gridx = 4;
	cc.gridy = 4;
	JPanel.add(cc);
	String type = HeroType.heroTypeToStr(index);
    	
    	// Hero hero = CharacterFactory.newCharacter(name, type);
    	// if (index == 6) {
    	// 	System.exit(0);
    	// }
    	
    	// PlayerStats.printstats(hero);
    	// Storage.Openfile();
    	// String str = hero.getType() + "," + hero.getName() + "," + hero.getLevel() + "," + hero.getHit_points() + "," + hero.getAttack() + "," + hero.getDefense() ;
        // Storage.writeToFile(str);
    	
        // Storage.closefile();
    //System.out.println(list.getSelectedValue());
    f.add(new JScrollPane(list));
    f.pack();

    JLabel label = new JLabel("Available hero's");  
    label.setBounds(50,15, 100,30);
    
    JLabel label2 = new JLabel("Hero stats");  
    label2.setBounds(300,15, 100,30);
	          
	

	//button1.addActionListener(new ActionListener() {
// 	public void actionPerformed(ActionEvent e){

//     }  
// });
	// f.add(text1);
	f.add(panel);
	f.add(label);
	f.add(label2);
	          
	f.setSize(600,500);//400 width and 500 height  
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible  
	//f.pack();
	}

	public static void viewMap() {
		final JFrame f= new JFrame("Create New Hero");  
		final JTextField tf=new JTextField(); 
		Map.buildMap(); 
		Map.redrawMap();
		  //tf.setText("power");
		   tf.setBounds(100,60, 400,400);  
		   //final JButton button=new JButton("OK");  
		   //button.setBounds(120,80,95,30);  
		   //button.addActionListener(new ActionListener(){  
	//    public void actionPerformed(ActionEvent e){
	// 			Map.buildMap();
	// 			Map.redrawMap();
		
	// 		   }  
		  
		//    f.add(button);  
		   f.add(tf);
		   f.setSize(400,400);  
		   f.setLayout(null);  
		   f.setVisible(true);
	}

  


}
