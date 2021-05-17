package com.Day5.java;
class Welcome {
	public void display() {
	System.out.println("Welcome");
	}
}
class Absent_Present {
	public void check() {
		public int attendance = (int)Math.floor(Math.random()*2);
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
class Switch {
	final int sal = 20;
	 final int hours = 8;
	 final int part_time_hours = 4;
    void choice() {
	int attendance = (int)Math.floor(Math.random()*3); 
	System.out.println(attendance);
	switch(attendance)
	{
	case 0:
		System.out.println("Employee is absent");
		break;
	case 1:
		System.out.println("Employee is part time present");
		int part_time_salary = sal*part_time_hours;
		System.out.println(part_time_salary);
	break;
	case 2:
		System.out.println("Employee is full time present");
		int total_salary = sal*hours;
		int monthly_salary=sal*hours*20;
		System.out.println(total_salary);
		System.out.println("Monthy Salary is : " + monthly_salary);
	break;
	default:
	System.out.println("Invalid output");
	break;
	
	}
  }
}
class While_Condition {
	 int hours = 0;
	 int days = 0;
	 int wage = 20;
	 int total_salary;
	 void compute() {
	while (hours <= 100 && days <= 20)
	{
		total_salary = wage*hours*days;
		System.out.println(total_salary);
		hours ++;
		days ++;
	}
}
	 
}

public class Day5Assignment {
	public static void main(String[] args) {
		
		//Welcome obj = new Welcome();
		//obj.display();
		//Absent_Present obj1 = new Absent_Present();
		//obj1.check();
		//Wage_Calculator obj2 = new Wage_Calculator();
		//obj2.calculate();
		//Part_time_wage obj3 = new Part_time_wage();
		//obj3.part_time_wage();
		//Switch obj4 = new Switch();
		//obj4.choice();
		While_Condition obj5 = new While_Condition();
        obj5.compute();		
	}

}
