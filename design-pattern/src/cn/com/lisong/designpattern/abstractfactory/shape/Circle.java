package cn.com.lisong.designpattern.abstractfactory.shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw method.");
	}

}
