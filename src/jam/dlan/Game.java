package jam.dlan;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Game extends BasicGame {

	public static final String TITLE = "DLAN-JAM";

	public static final int GAME_WIDTH = 1280;
	public static final int GAME_HEIGHT = 720;

	public Game() {
		super(TITLE);
	}

	private Enemy e;

	@Override
	public void init(final GameContainer gameContainer) throws SlickException {
		e = new Enemy(100, 100);
	}

	@Override
	public void update(final GameContainer gameContainer, final int i) throws SlickException {
		e.update();
	}

	@Override
	public void render(final GameContainer gameContainer, final Graphics graphics) throws SlickException {
		graphics.scale(Display.getWidth() / GAME_WIDTH, Display.getHeight() / GAME_HEIGHT);
		e.render(graphics);
	}
}
