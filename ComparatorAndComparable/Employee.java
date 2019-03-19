package com.collections.excercise.comparableandcomparator;

public class Employee implements Comparable{
	
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname=lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int compareTo(Object emp) {
		int emp_age= ((Employee) emp).getAge();
		return this.age -emp_age;
	  }
}
