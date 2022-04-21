package ar.edu.unq.po2.tp3;


public class Rectangle {

	Point origin;
	private int width;
	private int height;
	
	public Rectangle(Point origin, int width, int height) {
		//if (width != height) Lo dejo comentado pero habr�a que hacer esta validaci�n.
		this.origin = origin;
		this.width = width;
		this.height = height;
	}

	public Integer area() {
		return width * height;
	}

	public Integer perimeter() {
		return width * 2 + height * 2;
	}

	public Boolean isVertical() {
		return height > width;
	}

}
