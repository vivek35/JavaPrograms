package com.collections.excercise.comparableandcomparator;

import java.util.*;
public class MyStart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ch;
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setFirstname("Vivek");
		emp1.setLastname("Gaikwad");
		emp1.setAge(25);
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setFirstname("Tejas");
		emp2.setLastname("Desai");
		emp2.setAge(26);
		
		Employee emp4=new Employee();
		emp4.setId(3);
		emp4.setFirstname("Ameya");
		emp4.setLastname("Ved");
		emp4.setAge(27);
		
		Employee emp3=new Employee();
		emp3.setId(1);
		emp3.setFirstname("Dhruv");
		emp3.setLastname("Ved");
		emp3.setAge(25);
		
		ArrayList<Employee> employee=new ArrayList<Employee>();
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		
		do {
			System.out.println("Press 1 to sort by Age");
			System.out.println("Press 2 to sort by FirstName");
			System.out.println("Press 3 to sort by LastName");
			System.out.println("Enter your choice");
			ch=Integer.parseInt(input.nextLine());
		if(ch==1) {
			for(Employee e:employee) {
				int emp_id=e.getId();
				String emp_fname=e.getFirstname();
				String emp_lname=e.getLastname();
				int emp_age=e.getAge();
				System.out.println("ID: "+emp_id+" Firstname: "+emp_fname+" Lastname: "+emp_lname+" Age: "+emp_age);
			}
			Collections.sort(employee);
			System.out.println("After Sorting");
			for(Employee e:employee) {
				int emp_id=e.getId();
				String emp_fname=e.getFirstname();
				String emp_lname=e.getLastname();
				int emp_age=e.getAge();
				System.out.println("ID: "+emp_id+" Firstname: "+emp_fname+" Lastname: "+emp_lname+" Age: "+emp_age);
			}
		}else if(ch==2) {
			for(Employee e:employee) {
				int emp_id=e.getId();
				String emp_fname=e.getFirstname();
				String emp_lname=e.getLastname();
				int emp_age=e.getAge();
				System.out.println("ID: "+emp_id+" Firstname: "+emp_fname+" Lastname: "+emp_lname+" Age: "+emp_age);
			}
			Collections.sort(employee,new FirstnameComparator());
			System.out.println("After Sorting");
			for(Employee e:employee) {
				int emp_id=e.getId();
				String emp_fname=e.getFirstname();
				String emp_lname=e.getLastname();
				int emp_age=e.getAge();
				System.out.println("ID: "+emp_id+" Firstname: "+emp_fname+" Lastname: "+emp_lname+" Age: "+emp_age);
			}
		}else if(ch==3) {
			for(Employee e:employee) {
				int emp_id=e.getId();
				String emp_fname=e.getFirstname();
				String emp_lname=e.getLastname();
				int emp_age=e.getAge();
				System.out.println("ID: "+emp_id+" Firstname: "+emp_fname+" Lastname: "+emp_lname+" Age: "+emp_age);
			}
			Collections.sort(employee,new LastnameComparator());
			System.out.println("After Sorting");
			for(Employee e:employee) {
				int emp_id=e.getId();
				String emp_fname=e.getFirstname();
				String emp_lname=e.getLastname();
				int emp_age=e.getAge();
				System.out.println("ID: "+emp_id+" Firstname: "+emp_fname+" Lastname: "+emp_lname+" Age: "+emp_age);
			}
		}
		}while(ch!=4);
	}

}
