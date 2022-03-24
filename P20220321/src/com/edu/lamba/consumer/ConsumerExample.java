package com.edu.lamba.consumer;

import java.util.function.*;

public class ConsumerExample {

	public static void main(String[] args) {

		// 함수적 인터페이스 : 람다표현식 가능.
		Consumer<String> consumer = (t) -> {
			System.out.println(t + "출력합니다");
		};
		consumer.accept("메세지를");

		BiConsumer<Integer, Integer> biCon = (t, u) -> {

			System.out.println("result=" + (t + u));

		};biCon.accept(20, 40);

	}

}
