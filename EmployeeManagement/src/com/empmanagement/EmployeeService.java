package com.empmanagement;

//import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
//import java.util.TreeSet;

public class EmployeeService {
	
	HashSet<Employee> empset=new HashSet<Employee>();
	
	Employee emp1 = new Employee(1001, "Dinesh", 24, "Software Developer", "Computer", 22000);
	Employee emp2 = new Employee(1002, "Anuj", 23, "IT Analyst","IT", 17000);
	Employee emp3 = new Employee(1003, "Pratik", 25, "Manager","Admin", 45000);
	Employee emp4 = new Employee(1004, "Mayur", 28, "Salesforce Developer","IT",  36000);
	
	Scanner sc = new Scanner(System.in);
	boolean found = false;
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double sal;
	
	public EmployeeService() 
	{	
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);	
	}
	
	// View all Employees
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	
	// View Employee based on there Employee-id
	public void viewEmp(){
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	
	// Update Employee
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter Updated Name : ");
				name=sc.next();
				System.out.println("Enter Updated Salary : ");
				sal=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("Updated Details of Employee are : ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Updated Employee details Sccessfully \n");
		}
	}
	
	// Delete Employee
	public void deleteEmp() {
		System.out.println("Enter Id : ");
		id=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	
	// Add Employee
	public void addEmp() {
		System.out.println("Enter ID :");
		id=sc.nextInt();
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter Age : ");
		age=sc.nextInt();
		System.out.println("Enter Desiganation : ");
		desiganation=sc.next();
		System.out.println("Enter Department : ");
		department=sc.next();
		System.out.println("Enter Salary : ");
		sc.nextDouble();
		
		Employee emp=new Employee(id, name, age, desiganation, department, sal);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("\n\tEmployee Added Successfully \n");
	}
}
