package com.jsp.view;

import java.util.Scanner;

import com.jsp.model.Student;
import com.jsp.controller.*;

public class Student_view {
	private static Scanner sc=new Scanner(System.in);
	//getStudent method()
	public static Student getStudent() {
		Student s=new Student();
		System.out.println("Enter the Id: ");
		int id=sc.nextInt();
		sc.nextLine();//dummy instruction
		System.out.println("Enter the name: ");
		String name=sc.nextLine();
		System.out.println("Enter the email: ");
		String email=sc.nextLine();
		System.out.println("Enter the course: ");
		String course=sc.nextLine();
		System.out.println("Enter the gender: ");
		String gender=sc.nextLine();
		System.out.println("Enter the branch: ");
		String branch=sc.nextLine();
		System.out.println("Enter the dob: ");
		String dob=sc.nextLine();
		System.out.println("Enter the address: ");
		String address=sc.nextLine();
		System.out.println("Enter the mob: ");
		long mob=sc.nextLong();
//		sc.nextLine();//dummy instruction
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setCourse(course);
		s.setGender(gender);
		s.setBrunch(branch);
		s.setAddress(address);
		s.setDob(dob);
		s.setMob(mob);
		return s;
		
		
	}
	
public static void main(String[]args) {	System.out.println("-----------------------");
	System.out.println("...Welcome To SMS...");
	System.out.println("-----------------------/n");
	
	Student_controller student=new Student_controller();
	
	while(true) {
		System.out.println("1.save the Students info");
		System.out.println("2.find student by id");
		System.out.println("3.update student email by id");
		System.out.println("4.delete student by id");
		System.out.println("5.find all student");
		System.out.println("6.exit");
		System.out.println("Enter Your choice from following...");
		int choice =sc.nextInt();
		
		
	switch(choice){
		case 1:
			Student s=getStudent();
			student.saveStudentById(s);
//			System.out.println(s);//toString
			
			break;
		case 2:
			System.out.println("Enter the id");
			int id=sc.nextInt();//101,102
			Student s1=student.findStudentById(id);
			if(s1 != null) {
				System.out.println(s1);
			}
			else {
				System.out.println("Record not found...");
			}
//			System.out.println("2.find student by id");
			break;
		case 3:
			System.out.println("Enter the id");
			int id1=sc.nextInt();//101,102
			System.out.println("Enter the NewEmail...");
			sc.nextLine();//dummy Instruction
			String newE=sc.nextLine();
			student.updateStudent(id1,newE);
//			System.out.println("3.update student email by id");
			break;
		case 4:
			System.out.println("Enter the id..");
			int id2=sc.nextInt();
			Student s2=student.deleteById(id2);
//			System.out.println("4.delete student by id");
			break;
		case 5:
			student.findAll();
//			System.out.println("5.find all student");
			break;
		case 6:
			System.out.println("Thank you");
			return;//control transfer system
		default:
			System.out.println("Invalid Choice!!!");
			
	}
	}
}
}
