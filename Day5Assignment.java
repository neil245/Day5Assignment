package com.Day5.java;
class Welcome {
	public void display() {
	System.out.println("Welcome");
	}
}
class Absent_Present {
	public void check() {
		int attendance = (int)Math.floor(Math.random()*2);
		if (attendance == 0) {
			System.out.println("Employee is absent");
		}
		else {
			System.out.println("Employee is present");
		}
	}
}
public class Day5Assignment {
	public static void main(String[] args) {
		
		Welcome obj = new Welcome();
		obj.display();
		Absent_Present obj1 = new Absent_Present();
		obj1.check();
	}

}
