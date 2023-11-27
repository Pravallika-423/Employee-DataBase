package serviceimpl;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import service.EmployeeService;

public class EmpServiceImpl implements EmployeeService {

	ArrayList<Employee> l1 = new ArrayList<Employee>();
	Scanner ip = new Scanner(System.in);

	public void addEmployee() {

		System.out.println("=======Enter Employee Details=======");
		;
		System.out.println("Enter Employee name  :");
		String ename = ip.next();
		System.out.println("Enter Employee Eid  :");
		int eid = ip.nextInt();
		System.out.println("Enter Employee phone number  :");
		long emphone = ip.nextLong();
		System.out.println("Enter Employee salary  :");
		double esal = ip.nextDouble();
		System.out.println("Enter Employee age  :");
		int age = ip.nextInt();
		System.out.println("Enter Employee desgn  :");
		String design = ip.next();
		l1.add(new Employee(ename, eid, emphone, esal, age, design));
		System.out.println("Employee data had been saved...!!!");

	}

	public void getEmpByEid() {
		// TODO Auto-generated method stub
		System.out.println("enter Employee id :");
		int eid = ip.nextInt();
		System.out.println("searching Employee by eid...!! ");
		boolean flag = false;
		for (Employee e : l1) {
			if (e.getEid() == eid) {
				System.out.println(e);
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Employee not found..!!");
		}
	}

	public void getEmpBySal() {
		System.out.println("Enter the salary :");
		int sal=ip.nextInt();
		System.out.println("searching Employee by salary..!!!");
		boolean flag=false;
		for(Employee e:l1)
		{
			if(e.getEsal()==sal) {
				System.out.println(e);
				flag=true;
				break;
			}
		}
		if(flag=false) {
			System.out.println("Employee not found..!!!");
		}

	}

	@Override
	public void updateEmpByEid() {
		// TODO Auto-generated method stub
		System.out.println("Enter eid to be updated..");
		int eid = ip.nextInt();
		boolean flag = false;
		for (Employee e : l1) {
			if (e.getEid() == eid) {
				flag = true;
				System.out.println("=====Attributes====");
				System.out.println("1.Name\n2.Salary\n3.Age\n4.Designation\n5.Phone number");
				System.out.println("Enter your option");
				int op = ip.nextInt();
				switch (op) {
				case 1:
					System.out.println("Enter new name :");
					String name = ip.next();
					e.setEname(name);
					break;

				case 2:
					System.out.println("Enter new salary :");
					double sal = ip.nextDouble();
					e.setEsal(sal);
					break;

				case 3:
					System.out.println("Enter new age :");
					int age = ip.nextInt();
					e.setEage(age);
					break;

				case 4:
					System.out.println("Enter new designation :");
					String desgn = ip.next();
					e.setEdesgn(desgn);
					break;

				case 5:
					System.out.println("Enter new phone number :");
					long phno = ip.nextLong();
					e.setEphno(phno);
					break;

				default:
					System.out.println("invalid option....!!");
				}
			}
		}
		if (flag == false) {
			System.out.println("Employee not found");
		}
	}

	
	
	

	@Override
	public void removeEmpByEid() {
		// TODO Auto-generated method stub
		System.out.println("Enter Eid to be removed");
		int eid=ip.nextInt();
		boolean flag=false;
		for(int i=0;i<l1.size();i++) {
			Employee e=l1.get(i);;
			if(e.getEid()==eid) {
				System.out.println("Employee had been removed Successfully");
				l1.remove(i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Employee not found..!!");
		}
	
		
	}
	public void allDetails() {
		System.out.println("==========Employee Details=======");
		if(l1.size()==0){
			System.out.println("DataBase is empty..!!!");
		}
		else {
			for(Employee e:l1) {
				System.out.println(e);
			}
		}
	}

}
