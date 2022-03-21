package com.edu;

public class DriverExample {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1 = new Taxi();
		v1 = new Bus();

		Driver driver = new Driver();
		driver.drive(v1); // 매개변수의 다형성.

		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		System.out.println("Vehicle의 최고속력:" + vehicle.getMaxSpeed());
		System.out.println("Taxi의 최고속력:" + taxi.getMaxSpeed());
		System.out.println("Bus의 최고속력:" + bus.getMaxSpeed());

		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = vehicle;
		vehicles[1] = taxi;
		vehicles[2] = bus;

		// 속도가 제일 빠른 타는것의 정렬해서 vehicles[0]택, vehicles[1]버, vehicles[2]
		// if(intAry[i]>intAry[i+1])
		// if(ve

		int loopCnt = vehicles.length - 1;
		for (int cnt = 0; cnt < loopCnt; cnt++) {
			Vehicle temp = vehicles[0];
			for (int i = 0; i < vehicles.length-1; i++) {

				if (vehicles[i].getMaxSpeed() < vehicles[i + 1].getMaxSpeed()) {
					temp = vehicles[i];
					vehicles[i] = vehicles[i + 1];
					vehicles[i + 1] = temp;
				}
			}
		}
		System.out.println( vehicles[0]); // 택시의 최고속도는 120입니다.
		System.out.println( vehicles[2]); // 탈것의 최고속도는 100입니다.

	}
}
