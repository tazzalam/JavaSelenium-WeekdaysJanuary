package coreJava;

public class Execution {
public static void main(String[] args) {
	Computer refVar = new Computer ();
	//Class Name + reference variable = new Constructor
	
	refVar.year= 1;
	
	refVar.model= "ASUS";
	
	Computer refVar1 = new Computer(2019);
	
	Computer refvar2 = new Computer("Mac");
	
	System.out.println(refVar1.display);
	
	System.out.println(Computer.keys);
	
	//Method
	Method method = new Method();
	method.getAddress();
	
	method.getTime();
	
	method.calculator1(7,8);
}
}