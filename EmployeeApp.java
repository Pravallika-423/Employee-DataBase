package app;

import java.util.Scanner;

import service.EmployeeService;
import serviceimpl.EmpServiceImpl;

public class EmployeeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService e1 = new EmpServiceImpl();
		System.out.println("========Employee DataBase=============");
		while (true) {
			System.out.println("=========Menu=========");
			System.out.println("1.Add Employee\n2.Get Employee by EId\n3.Update Employee by Eid");
			System.out.println("4.get Emp by sal\n5.Remove Employee by Eid\n6.All Employee details\7.Exit");
			System.out.println("enter your option");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				e1.addEmployee();
				break;
			case 2:
				e1.getEmpByEid();
				break;
			case 3:
				e1.updateEmpByEid();
				break;
			case 4:
				e1.getEmpBySal();
				break;
			case 5:
				e1.removeEmpByEid();
				break;
			case 6:
				e1.allDetails();// find all
				break;
			case 7:
				System.out.println("======ThankYou...Visit Again...!!!======");
				System.exit(0);
				break;
			default:
				System.out.println("invalid option....!!!");

			}

		}
	}
}
