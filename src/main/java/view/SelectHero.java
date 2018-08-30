package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import java.util.List;

public class SelectHero {
	private static String Nam;
    private static String LEVEL;
	private static String HP;
	private static String ATK;
    private static String DEF;
    private static String WEAP;
	private static String ARM;
	private static int index = 1;
	static Hero hero;

	public static void graphic(){ 
		final List<String[]> heroList = Storage.getHeroList();
		
		JFrame f=new JFrame("Swing");
		DefaultListModel<String> l2 = new DefaultListModel<>();  
		final JList<String> list1 = new JList<>(l2);
		list1.setBounds(50,80, 170,200);   
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
	
		for(String[] heroStat: heroList) {
			System.out.println(index + ". " + heroStat[1]);
			l2.addElement(heroStat[1]);
			index++;	
		}
			list1.setModel(l2);
	
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				index = list1.getSelectedIndex();
				System.out.println(">> " + index);
	
				String[] heroStat = heroList.get(index);
				Nam = "Name : " + heroStat[1] + "\n";
				LEVEL = "Level :" + heroStat[2]  + "\n";
				HP = "Health :" + heroStat[3]+ "\n";
				ATK = "Attack :" + heroStat[4]+ "\n";
				DEF = "Defense :" + heroStat[5] + "\n";
				WEAP = "Weapon :" +  heroStat[6]+ "\n";
				ARM = "Armor :" +  heroStat[7]+ "\n";
			
				hero = CharacterFactory.newCharacter(heroStat[1].trim(), heroStat[0].trim());
				tf.setText(Nam + LEVEL + HP + ATK + DEF + WEAP + ARM);
	
		
				}
			});
	
		
	
	
		button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
			Graphic.GameSim(hero);
	
		}  
	});
		f.add(tf);
		f.add(button);
		f.add(button2);
		f.add(list1);
		f.add(label);
		f.add(label2);        
		f.setSize(600,500);//400 width and 500 height 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null); 
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		//f.pack();
		}
}
