package main;
//import javax.swing.*;

import main.*;
import view.Colours.*;
import view.NewHero;

import java.util.Scanner;

import Model.ExistingHero;
import controller.Graphic;  
public class Main {
	
	 private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) { 
	
	int swValue;
    System.out.println( "   MAIN MENU FOR SWINGY    \n");
    System.out.println("1. Create a new Hero");
    System.out.println("2. Select from existing Hero's");
    System.out.println("3. Play on GUI");
    System.out.println("4. Exit ");
    swValue = Keyin.inInt(" Select option: ");

  
    switch (swValue) {
    case 1:
    	System.out.println("\n##########CREATE HERO###########\n");
    	
    	 Scanner scanner = new Scanner(System.in);
    	    System.out.print("Enter Name : ");
    	    
    	    String name = scanner.nextLine(); 
    	  
    	    HeroType._type(name);
      break;
    case 2:
    	System.out.println("\n##########SELECT FROM EXISTING HERO'S###########\n");
    	
//   	 	Scanner scann = new Scanner(System.in);
//   	 		System.out.print("Enter Name : ");
//   	    
//   	 		String player = scann.nextLine(); 
   	  
   	 		ExistingHero._typeofHero();
      break;
    case 3:
    	new Graphic();
      break;
    case 4:
    	System.exit(0);
      break;
    default:
      System.out.println("Invalid selection");
      break; // This break is not really necessary
    }
    

	} 
}