import java.util.Objects;

public class Ship {
	private int x = 0, y = 0, speed = 0;

	public Ship(){
	}
	public Ship(int X, int Y){
		x = X;
		y = Y;
	}
	public Ship(int X, int Y, int Speed){
		x = X;
		y = Y;
		speed = Speed;
	}
	public boolean equals(Ship ship){
		if (x==ship.x && y==ship.y && speed==ship.speed){
			return true;
		}
		return false;
	}
	public String toString() {
		return	"x=" + x + ", y=" + y + ", speed=" + speed;
	}
}
