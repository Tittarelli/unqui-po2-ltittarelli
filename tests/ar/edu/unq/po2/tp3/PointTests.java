package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTests {

	@Test
	void testCreatingAPointWithReferenceValues() {
		Point point = Point.createIn(3,4);
		assertEquals(3, point.x());
		assertEquals(4, point.y());
	}
	
	@Test
	void testCreatingAPointWithoutReferenceValues() {
		Point point = Point.coordinateOrigin();
		assertEquals(0, point.x());
		assertEquals(0, point.y());
	}
	
	@Test
	void testMovingAPoint() {
		Point point = Point.coordinateOrigin();
		assertEquals(0, point.x());
		assertEquals(0, point.y());
		point.moveTo(3,4);
		assertEquals(3, point.x());
		assertEquals(4, point.y());
	}

	@Test
	void testSumOfTwoPoints() {
		Point point = Point.createIn(2,11);
		Point anotherPoint = Point.createIn(4,7);
		point.sum(anotherPoint);
		assertEquals(6, point.x());
		assertEquals(18, point.y());
	}

}
