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
import java.util.Scanner;
import controller.*;
import view.*;
import model.*;
import util.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridBagConstraints;
import artifacts.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Graphic {
	static Hero hero;
	private static int xposition;
	private static int yposition;
	static char[][] battleBoard = new char[9][9];
	
	public static char ft_fetch_from_map(int x, int y)
	{
		return (battleBoard[y][x]);
	}
	public static int ft_board_len_x()
	{
		return (battleBoard.length - 1);
	}
	public static int ft_board_len_y()
	{
		return (battleBoard[0].length - 1);
	}
	
	public void ft_put_in_map(int x, int y, char nameChar)
	{
		battleBoard[x][y] = nameChar;
	}

	
	
	public static void newPlayer() {
		final JFrame f= new JFrame("Create New Hero");  
		final JTextField tf=new JTextField("Enter Name");  
		  //tf.setText("power");
		   tf.setBounds(200,60, 200,40);  
		   final JButton button=new JButton("OK");  
		   button.setBounds(250,100,95,30);  
		   button.addActionListener(new ActionListener(){  
	   public void actionPerformed(ActionEvent e){
				String name = tf.getText();
				NewHero.newHero(name);
				//graphic();
				f.dispose();
			   }  
		   });
		   f.add(button);  
		   f.add(tf);
		   f.setSize(600,500);
		   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   f.setLocationRelativeTo(null);  
		   f.setLayout(null);  
		   f.setVisible(true);
	}

	

	

	public static void GameSim(final Hero hero){
		final JFrame window =new JFrame("Swing");
		JButton button1, button2, button3, button4;
		final JTextArea tf=new JTextArea();  
		tf.setBounds(30,50, 540,300);
		JScrollPane scroll = new JScrollPane(tf);
    	//JPanel panelForScroll = new JPanel(null);

		final int maxXBoardSpace = ft_board_len_x();
		final int maxYBoardSpace = ft_board_len_y();
		final Map map = new Map(); 
		Map.buildMap();

		
		Enemy[] enemy = new Enemy[4];
		hero.player();
		xposition = hero.xposition;
		yposition = hero.yposition;
		for (int i = 0; i < 4; i++) {
			enemy[i] = new Enemy(30,5,40,"zombie");
		}

		Map.redrawMap();

		button1 = new JButton("North");
		button1.setBounds(270,360,50,40);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
			map.ft_put_in_map(xposition, yposition, 'P');

				if ((yposition - 1) > 0)
					{
						if (map.ft_fetch_from_map(xposition, yposition - 1) == '*')
							tf.append("Moved up\n");
						else
							fightingSimulgui(hero);
						yposition = yposition - 1;
					}
					else {
						yposition = yposition - 1;
						tf.append("You Have Won!\n");
					} 
			}
		});
	
		button2 = new JButton("East");
		button2.setBounds(330,400,50, 40);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
				if ((xposition + 1) < maxXBoardSpace)
					{
						if (map.ft_fetch_from_map(xposition + 1, yposition) == '*')
							tf.append("Moved right\n");
						else
							fightingSimulgui(hero);
						xposition = xposition + 1;
					}
					else{
						xposition = xposition + 1;
						tf.append("You Have Won!\n");
					}
			}
		}); 
		button3 = new JButton("South");
		button3.setBounds(270,420,50,40);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
	
				if ((yposition + 1) < maxYBoardSpace)
					{
						if (map.ft_fetch_from_map(xposition, yposition + 1) == '*')
							tf.append("Moved down\n");
						else
							fightingSimulgui(hero);
						yposition = yposition + 1;
					}	
					else {
						yposition = yposition + 1;
						tf.append("You Have Won!\n");	
					}
				
			}
		});
		button4 = new JButton("West");
		button4.setBounds(210,400,50,40);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  

					if ((xposition - 1) > 0)
						{
							if (map.ft_fetch_from_map(xposition - 1, yposition) == '*')
								tf.append("Moved left\n");
							else
								fightingSimulgui(hero);
							xposition = xposition - 1;
						}
						else {
							xposition = xposition - 1;
							tf.append("You Have Won!\n");	
						}
			}
		});

		window.add(tf);
        window.add(scroll);
		window.add(button1);
		window.add(button2);
		window.add(button3);  
		window.add(button4);
		window.setSize(600,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);  
		window.setLayout(null);  
		window.setVisible(true);

  
	}

	public static void fightingSimulgui(Hero hero) {
		JTextArea tf = new JTextArea();
	
         Enemy enemy = new Enemy(50, 50, 60, "Zombie");
        
         Simulation game = new Simulation(hero, enemy);
    
		int choice = JOptionPane.showOptionDialog(null, 
			"You have ancountered an Enemy, Do you wanna fight?", 
			"Fight", 
			JOptionPane.YES_NO_OPTION, 
			JOptionPane.QUESTION_MESSAGE, 
			null, null, null);
	  
	
		if (choice == JOptionPane.YES_OPTION)
		{
			fightgui(enemy,hero, tf);
		}
	}
	public static void fightgui(Enemy enemy, Hero Hero, JTextArea tf) {
		
        Attacker game = new Attacker();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("INTERUPTED DELAY");
        }

        while (!enemy.isDead() && !hero.isDead())
        {
            game.attacksgui(hero, enemy);
        }
            if (enemy.isDead()){
				tf.setText("The Enemy is dead!");
                victory();
                return;
            }
            
            else if (hero.isDead()){
				tf.setText("You are dead!");
                defeat();
                 return; 
            }
    
	}	

	 private static void victory() {
	        System.out.println("You are the ultimate warrior.");
            System.out.println("You Have leveled up.." );
            System.out.println("LEVEL : " + hero.getLevel() + " Experience : " + hero.getExperience() + "\n");
	    }

	    private static void defeat() {
	        System.out.println("You're Good...but Not That Good.");
            System.out.println("########## GAME OVER ###########\n");
            System.exit(0);
	    }
}
