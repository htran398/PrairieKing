import processing.core.PApplet;

public class MachineGun extends BackgroundObj {
	
	public MachineGun(PApplet w, float x, float y) {
		super();
		this.window = w;
		this.x = x;
		this.y = y;
		this.used = false;
		spriteSheet = window.loadImage("machineGun.png");
		spriteX = 0;
		spriteY = 0;
		spriteWidth = 32;
		spriteHeight = 32;
	}
}
