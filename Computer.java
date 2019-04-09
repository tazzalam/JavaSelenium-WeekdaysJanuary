package coreJava;

public class Computer {
	int year;
	String model;
	String display = "15 inch";
	static String keys = "36 keys";
	public Computer() {
		
	}

public Computer(int year) {
	this.year=year;
	System.out.println(year);
		
	}
public Computer(String model) {
	this.model=model;
	System.out.println(model);

	}
}

