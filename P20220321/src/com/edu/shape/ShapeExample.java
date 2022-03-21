package com.edu.shape;

public class ShapeExample {

	public static void main(String[] args) {
		Shape s1 = new Ractangle();
		Shape s2 = new Circle();
		Shape s3 = new Triangle();

		Ractangle r1 = (Ractangle) s1;
		r1.setWidth(12.3);
		r1.setHeight(7.8);

		System.out.println(r1.getArea());

		Circle r2 = (Circle) s2;
		r2.setRadius(3);
		System.out.println(r2.getArea());

		Triangle r3 = (Triangle) s3;
		r3.setBase(3);
		r3.setHeight(2);
		System.out.println(r3.getArea());

	}

}
