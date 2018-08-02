package view;

import java.io.IOException;

import charecters.Hero;

public class StartGame implements WindowManager {

	public void showSelectHero() {
		SelectHero selectedHero = new SelectHero(this);
		
	}

	public void showNewHero() {
		NewHero newHero1 = new NewHero(this);
		//setContentpane(newHero1);
		//pack();
		
	}

	public void showSelectMission(Hero hero) {
		PlayMission playMission1 = new PlayMission(this, hero);
		//setContentpane(playMission1);
		//pack();
		
	}

}
