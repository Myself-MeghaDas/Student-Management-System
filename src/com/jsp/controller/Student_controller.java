package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.model.Student;


//database
public class Student_controller {
	private ArrayList<Student> listOfStudent =new ArrayList<Student>();
	
	public void saveStudentById(Student student) {
		listOfStudent.add(student);
		System.out.println("Data inserted...\n");
		findAll();
	}
	public Student findStudentById(int id) {
		for(Student s:listOfStudent) {
			if(s.getId()==id) {
				return s;
				}
			
		}
		return null;
	}
	public void updateStudent(int id,String newE) {
		Student s=findStudentById(id);
		
			if(s!=null) {
				s.setEmail(newE);
				System.out.println("Record Updated...\n");
				findAll();
			}
			else {
				System.out.println("Record not found\n");
			}
		
	}
	public Student deleteById(int id) {
		// TODO Auto-generated method stub
		Student s=findStudentById(id);
		if(s!=null) {
			listOfStudent.remove(s);
			System.out.println("Deleted\n");
			findAll();
		}
		else {
			System.out.println("Record not found\n");
		}
		return null;
	}
	public void findAll() {
		// TODO Auto-generated method stub
		for(Student s:listOfStudent) {
			System.out.println(s);
		}
	}
	
}
