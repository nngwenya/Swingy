package util;

import charecters.Elf;
//import charecters.Enemy;
import charecters.Flash;
import charecters.Hero;
import charecters.Knight;
import charecters.SuperGirl;
import charecters.Wizard;

public class CharacterFactory {
	public static Hero newCharacter(String name, String type) {
		if (type == "Elf") {
			return new Elf(name);
		}else if (type == "Flash") {
			return new Flash(name);
		}else if (type == "Knight") {
			return new Knight(name);
		}else if (type == "SuperGirl") {
			return new SuperGirl(name);
		}else if (type == "Wizard") {
			return new Wizard(name);
		}else
			return null;
		
	}

}
