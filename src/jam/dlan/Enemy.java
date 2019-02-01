package jam.dlan;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Enemy extends Entity {

	public Enemy() {
		this(0, 0);
	}

	public Enemy(int x, int y) {
		this(default_image, x, y, 2.0f);
	}

	public Enemy(Image image, int x, int y, float scale) {
		super(image, x, y);
		setScale(scale);
	}

	@Override
	public void update() {
		x++;
	}

	private static Image default_image = null;

	static {
		try {
			default_image = new Image("res/enemy/default.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
