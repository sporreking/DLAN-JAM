package jam.dlan;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) {
		try {
			AppGameContainer appgc;
			appgc = new AppGameContainer(new Game());
			appgc.setDisplayMode(1280, 720, false);
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
