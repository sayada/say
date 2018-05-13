package com.usa.learningjava;

public class Hwc extends Hwp {
	
	public static void main(String[] args) {
		Hwp obj = new Hwp();
		obj.getsalary();
		
		System.out.println(obj.name + " salary is" + obj.salary );
		System.out.println(obj.name1 + " salary is" + obj.salary1 );
	}
}
