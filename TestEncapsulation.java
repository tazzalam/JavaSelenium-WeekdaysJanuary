package oop;

public class TestEncapsulation {
	public static void main(String[] args) {

	Encapsulation encapsulation = new Encapsulation();
	encapsulation.setID(100);
	System.out.println(encapsulation.getID());
	
	encapsulation.setName("Apu");
	System.out.println(encapsulation.getName());
}
}