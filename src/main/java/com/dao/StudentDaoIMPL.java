package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class StudentDaoIMPL implements StudentDao {

	@Autowired
	private SessionFactory factory;

	public void saveStudent(Student stu) {

		Session session = factory.openSession();
		session.save(stu);
		session.beginTransaction().commit();

	}

	public List<Student> getAllData() {
		Session session = factory.openSession();
		Query querry = session.createQuery("from Student");
		List<Student> stulist = querry.getResultList();
		return stulist;
	}

	public List<Student> deleteStudent(int rollno) {
		Session session = factory.openSession();
		session.beginTransaction();
		Query querry = session.createQuery("delete from Student where rollno=  :rn ");
		querry.setParameter("rn", rollno);
		querry.executeUpdate();
		session.getTransaction().commit();

		return getAllData();
	}

	public List<Student> editStudent(int rollno, String name, String address) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Student s = session.get(Student.class, rollno);
		s.setName(name);
		s.setAddress(address);
		session.saveOrUpdate(s);
		tx.commit();

		return getAllData();
	}

}
