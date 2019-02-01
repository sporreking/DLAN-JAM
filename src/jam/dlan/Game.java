package jam.dlan;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Game extends BasicGame {

	public static final String TITLE = "DLAN-JAM";

	public Game() {
		super(TITLE);
	}

	@Override
	public void init(final GameContainer gameContainer) throws SlickException { }

	@Override
	public void update(final GameContainer gameContainer, final int i) throws SlickException { }

	@Override
	public void render(final GameContainer gameContainer, final Graphics graphics) throws SlickException {
		graphics.drawString("DLAN-JAM!", 100, 100);
	}
}
