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
class Wage_Calculator {
	public final int wage = 20;
	public final int hours = 8;
	public int total_wage;
	void calculate() {
		total_wage=wage*hours;
		System.out.println("Total wages is " + total_wage);
	}
	
}
class Part_time_wage {
	public final int parttimehours = 4;
	public final int wage1=20;
	public int parttimesal;
	public void part_time_wage() {
		parttimesal=wage1*parttimehours;
		System.out.println("Part time wages is " + parttimesal);
	}
}
public class Day5Assignment {
	public static void main(String[] args) {
		
		Welcome obj = new Welcome();
		obj.display();
		Absent_Present obj1 = new Absent_Present();
		obj1.check();
		Wage_Calculator obj2 = new Wage_Calculator();
		obj2.calculate();
		Part_time_wage obj3 = new Part_time_wage();
		obj3.part_time_wage();
	}

}
