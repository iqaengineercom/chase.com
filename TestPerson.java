package com.saibersys.testfiles;

public class TestPerson {
	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1);
		person1.setName("Raghu");
		System.out.println(person1);
		Person person2 = new Person("Vamshi", 23, 'M');
		System.out.println(person2.getName());
		
		Student student = new Student("harish", 10, 'm', "venkateswara");
		student.show();
		
		
	}
}
