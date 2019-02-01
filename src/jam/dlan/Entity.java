package jam.dlan;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public abstract class Entity {

	protected Image image;
	protected int x, y;

	protected float scale = 1;

	public Entity(Image image, int x, int y) {
		this.image = image;
		this.x = x;
		this.y = y;
	}

	public abstract void update();

	public void render(final Graphics g) {
		image.draw(x, y, scale);
	}

	public Image getImage() {
		return image;
	}

	public void setImage(final Image image) {
		this.image = image;
	}

	public int getX() {
		return x;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(final int y) {
		this.y = y;
	}

	public float getScale() {
		return scale;
	}

	public void setScale(final float scale) {
		this.scale = scale;
	}
}
