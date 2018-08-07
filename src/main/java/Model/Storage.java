package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;


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
	
	public static int getLinesCount(){
		try{
			File file = new File("Hero.txt");
			FileReader fReader = new FileReader(file);
			LineNumberReader lReader = new LineNumberReader(fReader);
			lReader.skip(Long.MAX_VALUE);
			int count = lReader.getLineNumber();
			lReader.close();
			return count;
		}
		catch (IOException ioe){
			ioe.getMessage();
		}
		return -1;
	}
//	public static String[] ReadLine(){
//		try{
//			File file = new File("Hero.txt");
//			FileReader fReader = new FileReader(file);
//			BufferedReader bReader = new BufferedReader(fReader);
//			String line = null;
//			String items[] = new String[getLinesCount()];
//			int index = 0;
//
//			while ((line = bReader.readLine()) != null){
//				items[index] = line;
//				index++;
//				System.out.println(line);
//			}
//			bReader.close();
//			return items;
//		}
//		catch (IOException ioe){
//			ioe.getMessage();
//		}
//		return null;
//	}
	
	public static void SplitLine() {
		   try {
			   	File file = new File("Hero.txt");
				FileReader fReader = new FileReader(file);
				BufferedReader bReader = new BufferedReader(fReader);
		        String str;
		        String[] item;
		        int i = 0;

		        while ((str = bReader.readLine())!= null) {
		        	item[i]=str.split(",");
		            i++;
		            System.out.println(str);
		          
		        }
		        bReader.close();
		    } catch (IOException e) {
		        System.out.println("File Read Error");
		    }
	}
	
//	public static void readfile() throws IOException {
	      
//	      try {
//	    		BufferedReader reader = new BufferedReader(new FileReader(FILENAME)); 
//	    	   
//	    	    String str;
//	    	    while ((str = reader.readLine()) != null) {
//	    	       
//	    	    	//for (int i = 1; i < str.length(); i++) {
//	    	    		System.out.println(str);
//	    	    	//}
//	    	    }
//	    	     
//
//	    	} finally {
//	           
//	      
//	    	}    
	//}
}
