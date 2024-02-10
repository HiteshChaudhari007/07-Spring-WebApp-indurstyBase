package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {

	void saveStudent(Student stu);

	List<Student> loginChek(String username, String password);

	List<Student> deleteStudent(int rollno);

	List<Student> getStudent();

	List<Student> editStudent(int rollno, String name, String address);

}
