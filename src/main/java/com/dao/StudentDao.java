package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {

	void saveStudent(Student stu);

	List<Student> getAllData();

	List<Student> deleteStudent(int rollno);

	List<Student> editStudent(int rollno, String name, String address);

}
