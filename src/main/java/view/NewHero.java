package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.*;
import controller.*;
import view.*;
import model.*;
import util.*;
import artifacts.*;

public class NewHero {
	static Hero hero;

		public static void newHero(final String name){
	
		JFrame f=new JFrame("Swing");
	
		final JTextArea tf=new JTextArea();  
		tf.setBounds(300,75, 170,210);
		final JButton button=new JButton("Start Game");  
		button.setBounds(200,300,95,30);
	
		final JButton button2=new JButton("Select Hero");  
		button2.setBounds(100,300,95,30);
	
		JLabel label = new JLabel("Available hero's");  
		label.setBounds(50,15, 100,30);
		
		JLabel label2 = new JLabel("Hero stats");  
		label2.setBounds(300,15, 100,30);
		
		  final DefaultListModel<String> Player = new DefaultListModel<>();
		  final JList<String> list = new JList<>(Player);
		  list.setBounds(50,80, 170,200);
	
		  Player.addElement("Elf");
		  Player.addElement("Flash");
		  Player.addElement("Knight");
		  Player.addElement("SuperGirl");
		  Player.addElement("Wizard");
	
		 
		  list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		  list.setSelectedIndex(0);
		  list.setVisibleRowCount(3);        
	
		  JScrollPane ScrollPane = new JScrollPane(list);       
		  JButton showButton = new JButton("Show");
	
		  button2.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) { 
				String data = "";
				String type = "";
	
				if(list.getSelectedIndex() != -1){
				   data += " Hero selected: ";
				   for(Object hero:list.getSelectedValues()){
					  data += hero + " ";
					  type = hero.toString();
				   }
			
			System.out.println("data: " + type);
			 hero = CharacterFactory.newCharacter(name, type);
			 Weapon weapon = new Weapon();
			 Armor armor = new Armor();
	
			Storage.Openfile();
			String str = type + "," + hero.getName() + "," + hero.getLevel() + "," + hero.getHit_points() + "," + hero.getAttack() + "," + hero.getDefense() + "," + weapon.getWeapon(hero) + "," + armor.getArmor(hero) ;
			Storage.writeToFile(str);
			
			Storage.closefile();
	
			}
				tf.setText(data);
			 }
		  }); 
	
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				Graphic.GameSim(hero);
		
			}  
		});
	
		f.add(tf);
		f.add(ScrollPane);    
		f.add(showButton);
		f.add(button);
		f.add(button2);
		f.add(list);
		f.add(label);
		f.add(label2);          
		f.setSize(600,500);//400 width and 500 height
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);
	
		}
}

