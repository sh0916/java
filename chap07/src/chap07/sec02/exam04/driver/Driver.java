package chap07.sec02.exam04.driver;

public class Driver {

	public void drive(Vehicle vehicle) {
		
		boolean isBus = vehicle instanceof Bus;
		if(isBus) {
			System.out.println("버스다.");
		}
		
		if(vehicle instanceof Taxi) {
			System.out.println("택시다.");
		}
		
//		Bus bus = (Bus) vehicle;
//		Taxi taxi = (Taxi) vehicle;
		vehicle.run();
	}
	
}
