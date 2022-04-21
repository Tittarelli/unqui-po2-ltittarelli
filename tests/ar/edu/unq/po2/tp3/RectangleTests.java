package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTests {
	Rectangle rectangle;

	@BeforeEach
	void setUp() throws Exception {
		rectangle = new Rectangle(Point.coordinateOrigin(), 3, 4);
	}

	@Test
	void testRectangleArea() {
		assertEquals(12, rectangle.area());
	}

	@Test
	void testRectanglePerimeter() {
		assertEquals(14, rectangle.perimeter());
	}
	
	@Test
	void testHorizontalOrVerticalRectangle() {
		assertTrue(rectangle.isVertical());
	}
}
