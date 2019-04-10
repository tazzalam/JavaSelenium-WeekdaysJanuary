package oop;

public class Polymorphism extends ConcreteCar{

	
	//Method Overloading
		public void calculator(int a, int b) {
			int c = a+b;
			System.out.println(c);
		}
		
		public void calculator(int a, int b, int d ) {
			int c =a+b;
			double g = c/d;
			System.out.println(g);
		}
		public static void main(String[] args) {
			Polymorphism polymorphism = new Polymorphism();
			polymorphism.calculator(10,15);
					
		
		
	}
	public void light() {
		System.out.println("headlight -- polymorphism class");
	}
	

}
