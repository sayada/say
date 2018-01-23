package com.usa.learningjava;

public class car {

 public void nicecar () {
	 System.out.println("red");
 }
 public static void uglycar() {
	 System.out.println("blue");
 }
 public static int richcar() {
	 System.out.println("white");
	 return 0;
 }
  public static void main(String[] args) {
	car call = new car();
	call.nicecar();
	car.uglycar();
	car.richcar();
  }
}
