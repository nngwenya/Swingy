package util;

import charecters.Elf;
//import charecters.Enemy;
import charecters.Flash;
import charecters.Hero;
import charecters.Knight;
import charecters.SuperGirl;
import charecters.Wizard;

public class CharacterFactory {
	public static Hero newCharacter(String name, int type) {
		if (type == 1) {
			return new Elf(name);
		}else if (type == 2) {
			return new Flash(name);
		}else if (type == 3) {
			return new Knight(name);
		}else if (type == 4) {
			return new SuperGirl(name);
		}else if (type == 5) {
			return new Wizard(name);
		}else
			return null;
		
	}

}
