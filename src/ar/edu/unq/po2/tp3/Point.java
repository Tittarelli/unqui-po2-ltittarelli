package ar.edu.unq.po2.tp3;

public class Point {

	private int x;
	private int y;
	
	private Point(int x, int y) {
		setPointIn(x, y);
	}
	public static Point createIn(int x, int y) {
		return new Point(x,y);
	}
	
	public static Point coordinateOrigin() {
		return createIn(0,0);
	}
	
	public int x() {
		return this.x;
	}
	
	public int y() {
		return this.y;
	}
	public void moveTo(int x, int y) {
		setPointIn(x, y);
	}
	private void setPointIn(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void sum(Point anotherPoint) {
		setPointIn(this.x + anotherPoint.x(), this.y + anotherPoint.y());
	}

}
