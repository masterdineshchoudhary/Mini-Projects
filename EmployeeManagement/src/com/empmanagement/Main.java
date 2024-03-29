package com.empmanagement;

import java.util.Scanner;
public class Main {

	EmployeeService service = new EmployeeService();
	static boolean ordering = true;
	public static void menu() {
		System.out.println("\n--------------------------------------------"
        			+ "\n\t EMPLOYEE MANAGEMENT SYSTEM	"
        			+ "\n--------------------------------------------\n"
        			+ "\n\t 1. Add Employee "
        			+ "\n\t 2. View Employee"
       				+ "\n\t 3. Update Employee"
       				+ "\n\t 4. Delete Employee"
       				+ "\n\t 5. View All Employee"
       				+ "\n\t 6. Exit");
    }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		
		do {
			menu();
			System.out.println("\n Enter choice : ");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("--- Add Employee ---");
				service.addEmp();
				break;
			case 2:
				System.out.println("--- View Employee ---");
				service.viewEmp();
				break;
			case 3:
				System.out.println("--- Update Employee ---");
				service.updateEmployee();
				break;
			case 4:
				System.out.println("--- Delete Employee ---");
				service.deleteEmp();
				break;
			case 5:
				System.out.println("--- View all Employees ---");
				service.viewAllEmps();
				break;
			case 6:
				System.out.println("*** Thank you for using application ***");
				System.exit(0);
				
			default:
				System.out.println("! Invalid choice !");
				break;
			}
		} while(ordering);
		sc.close();
	}
}

