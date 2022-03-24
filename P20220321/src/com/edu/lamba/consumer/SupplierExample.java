package com.edu.lamba.consumer;

import java.util.function.IntSupplier;

//Supplier 인터페이스 : 매개값(x) 반환값(o)
public class SupplierExample {

	public static void main(String[] args) {

		IntSupplier intSup = () -> (int) (Math.random() * 10);

		int result = intSup.getAsInt();
		System.out.println(result);
	}

}
