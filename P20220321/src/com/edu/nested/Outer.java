package com.edu.nested;

public class Outer {
	private String filed1;
	private int field2;

	class Inner { // 클래스안에 클래스 - 맴버클래스.
		String field3;
		int field4;

		void method2() {
			System.out.println("Inner.method2()");
		}

	}
	// 함수적 인터페이스: 구현해야 할 메소드가 하나인것.
	interface Runnable{
		void run();
	}
	class Bus implements Runnable{

		public void run() {
			System.out.println("Bus가 달립니다");
		}
		
	}

	public String getFiled1() {
		return filed1;
	}

	public void method1() {
		System.out.println("outer.method1()");
		Inner inner = new Inner();
		inner.method2();
	}

	public void method3() {
		System.out.println("outer.method3()");

		class Local { // 메소드안에 선언된 클래스는 로컬클래스 - 외부호출불가

			void method4() {
				System.out.println("Local.method4()");
			}

		}
		Local local = new Local();
		local.method4();
	}
	public void method4(){
		Runnable runnable = new Bus(); // 인터페이스의 구현객체 가능.
		runnable.run();
		
		// 익명구현객체. 메소드안에서만 가능 , 인터페이스 변수가 한개일때만 가능
		// Lambda 표현식.
		runnable = () -> System.out.println("임의의 객체를 실행합니다.");
//		runnable = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("임의의 객체의 실행합니다.");
//				
//			}
			
//		};
		runnable.run();
		
	}

}
