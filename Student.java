package com.saibersys.testfiles;

public class Student extends Person {
	private String school;

	public Student(String name, int age, char gender, String school){
		super(name,age,gender);
		this.school = school;
	}
	
	public void show(){
		int i=5;
		while(i>0) {
			System.out.println(this.toString() + " school:" + school);
			i--;
		}
		
	}
	
	
}
