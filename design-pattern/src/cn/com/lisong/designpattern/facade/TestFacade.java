package cn.com.lisong.designpattern.facade;

import org.junit.Test;

public class TestFacade {

	@Test
	public void testName() throws Exception {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
