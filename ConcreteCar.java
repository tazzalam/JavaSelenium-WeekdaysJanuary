package oop;

public class ConcreteCar extends AbstractCar implements InterfaceCar, interfaceCar2 {

	
	@Override
	public void start() {
	
		
	}

	@Override
	public void stop() {
		
		
	}

	@Override
	public void move() {
		System.out.println("moving functionality --car concrete- coming from interface");
	
		autoBrake();
	}

	@Override
	public void light() {
		
		
	}

	
	//implement -- interface
	//extend --abstract class
}

