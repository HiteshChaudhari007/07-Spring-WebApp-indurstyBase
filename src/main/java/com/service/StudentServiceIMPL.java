package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;

@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	private StudentDao dao;

	public void saveStudent(Student stu) {

		dao.saveStudent(stu);

	}

	public List<Student> loginChek(String username, String password) {
		if (username.equals("Hitesh") && password.equals("1234")) {
			return dao.getAllData();
		} else {

			return null;
		}
	}

	public List<Student> deleteStudent(int rollno) {

		return dao.deleteStudent(rollno);
	}

	public List<Student> getStudent() {

		return dao.getAllData();
	}

	public List<Student> editStudent(int rollno, String name, String address) {

		return dao.editStudent(rollno, name, address);
	}

}
