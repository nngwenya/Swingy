package main;
import controller.*;
public class Main {
	
  private static void printUsage() {
    System.out.println("usage: java -jar target/swingy-1.0-SNAPSHOT.jar [console|gui]");
} 
	public static void main(String[] args) { 

    if (args.length != 1) {
      printUsage();
      return;
  }

  GuiController guiController = new GuiController();

  switch (args[0].trim().toLowerCase()) {
      case "console":
          
      ConsoleController.console();
          break;
      case "gui":
          GuiController.startnow();
          break;
      default:
          printUsage();
          break;
  }
}
}