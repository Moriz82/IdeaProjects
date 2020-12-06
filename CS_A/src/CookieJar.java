public class CookieJar {
	private int capacity = 0, amntInside = 0;

	public CookieJar(int capacity) {
		this.capacity = capacity;
	}

	public int addStuff(int i) {
		if (amntInside+i<=capacity){
			amntInside+=i;
			return amntInside-capacity;
		}
		int allowed = Math.abs(amntInside-capacity);
		amntInside += allowed;
		return i-allowed;
	}

	public boolean isFull() {
		return (amntInside==capacity);
	}

	public int spaceLeft() {
		return capacity-amntInside;
	}
}
