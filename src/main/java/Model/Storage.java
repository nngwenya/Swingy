package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.*;
import util.*;
import view.*;


public class Storage {
	static File file;
	static FileWriter filewrt;
	private static final String FILENAME = "Hero.txt";
	public static void Openfile()
	{
		try
		{
			File file = new File("Hero.txt");
			if (!file.exists())
				{
					file.createNewFile();
				}	
				filewrt = new FileWriter(file, true);
		}
		catch(IOException ioe)
		{

		}

	}

	public static void closefile()
	{
		try
		{
			filewrt.close();
		}
		catch(IOException ieo)
		{

		}
	}
	public static void writeToFile(String line) {

		try {

			filewrt.write(line);
			filewrt.write("\n");
		
		} 
		catch (Exception e) 
		{

			e.printStackTrace();

		}
	}
	
	public static List<String[]> getHeroList()
	{
		List<String[]> heroList = new ArrayList<String[]>();
		
		   try {
			   	File file = new File("Hero.txt");
				FileReader fReader = new FileReader(file);
				BufferedReader bReader = new BufferedReader(fReader);
		        String str;
		        

		        while ((str = bReader.readLine())!= null) {
		        	String[] items =str.split(",");	
		        	heroList.add(items);
		        	
		        }
		        bReader.close();
		    } catch (IOException e) {
		        System.out.println("File Read Error");
		    }
		
		return heroList;
	}
	
	
	

}
