package com.wrapper.classes;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// converting primitives data type into object
				int rollNumber = 10; // rollNumber contain 10

				//Short s=new Short(250);
				Integer i = new Integer(rollNumber); // autoboxing

				// i contain 10
				System.out.println("Value of i is>>" + i); // 10

				// converting object into primitives data type
				int s = i.intValue();  //unboxing

				System.out.println("Value of s is>>" + s);


	}

}
