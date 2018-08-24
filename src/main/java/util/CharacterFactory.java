package util;

import model.Elf;
import model.Flash;
import model.Hero;
import model.Knight;
import model.SuperGirl;
import model.Wizard;

public class CharacterFactory {
	public static Hero newCharacter(String name, String type) {
		if (type.equalsIgnoreCase("Elf")) {
			return new Elf(name);
		}else if (type.equalsIgnoreCase("Flash")) {
			return new Flash(name);
		}else if (type.equalsIgnoreCase("Knight")) {
			return new Knight(name);
		}else if (type.equalsIgnoreCase("SuperGirl")) {
			return new SuperGirl(name);
		}else if (type.equalsIgnoreCase("Wizard")) {
			return new Wizard(name);
		}else
			return null;
		
	}

}
