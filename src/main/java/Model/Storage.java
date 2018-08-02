package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


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
	public static void readfile() throws IOException {
	      
	      try {
	    		BufferedReader reader = new BufferedReader(new FileReader(FILENAME)); 
	    	   
	    	    String str;
	    	    while ((str = reader.readLine()) != null) {
	    	       
	    	    	//for (int i = 1; i < str.length(); i++) {
	    	    		System.out.println(str);
	    	    	//}
	    	    }
	    	     

	    	} finally {
	           
	      
	    	}    
	}
}
